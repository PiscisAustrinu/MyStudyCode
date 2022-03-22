#include "mainwindow.h"
#include "ui_mainwindow.h"
#include<QPushButton>
#include<QVBoxLayout>
#include <QMessageBox>
#include <QtGui>
#include <QApplication>
#include<QFileInfo>
#include <QMessageBox>
#include <QFileDialog>
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui (new Ui::MainWindow)
{
    ui->setupUi(this);
    isSaved=false;
}
MainWindow::~MainWindow()
{
    delete ui;
}

 void MainWindow::newFile()
{
    saveornotFile();
  isSaved=false;
    curfile=tr("untitled.txt");
    setWindowTitle(curfile);
    ui->textEdit->clear();
    ui->textEdit->setVisible(true);

 }

void MainWindow:: saveornotFile()
{
    if(ui->textEdit->document()->isModified()) //如果文件被更改过，弹出保存对话框
     {
          QMessageBox box;
          box.setWindowTitle(tr("警告"));
          box.setIcon(QMessageBox::Warning);
          box.setText(curfile+tr(" 尚未保存，是否保存？"));
          box.setStandardButtons(QMessageBox::Yes | QMessageBox::No);
          if(box.exec() == QMessageBox::Yes) //如果选择保存文件，则执行保存操作
                 saveFile();
    }
}

void MainWindow::saveFile()
{
    if(isSaved){
        save(curfile);
        }
   else{
        saveasFile(); //如果文件是第一次保存，那么调用另存为
    }
}


void MainWindow:: saveasFile()
{
   QString fileName = QFileDialog::getSaveFileName(this,tr("另存为"),curfile);//获得文件名
    if(!fileName.isEmpty()){//如果文件名不为空，则保存文件内容
    save(fileName);
    }
}

bool MainWindow:: save(const QString &fileName){
    QFile file(fileName);

    if(!file.open(QFile::WriteOnly | QFile::Text)){QMessageBox::warning(this,tr("保存文件"), tr("无法保存文件 %1:\n %2").arg(fileName).arg(file.errorString()));//以只写方式打开文件，如果打开失败则弹出提示框并返回
    return false;}  //%1,%2表示后面的两个arg参数的值
     QTextStream out(&file);   //新建流对象，指向选定的文件
        out << ui->textEdit->toPlainText();   //将文本编辑器里的内容以纯文本的形式输出到流对象中
    isSaved = true;
     curfile = QFileInfo(fileName).canonicalFilePath(); //获得文件的标准路径
    setWindowTitle(curfile); //将窗口名称改为现在窗口的路径
    return true;
  }

void MainWindow:: openfile(){
   saveornotFile();//是否需要保存现有文件

    QString fileName = QFileDialog::getOpenFileName(this);

    //获得要打开的文件的名字

    if(!fileName.isEmpty())//如果文件名不为空

    {
    loadfile(fileName);

    }

    ui->textEdit->setVisible(true);//文本编辑器可见

}
bool MainWindow:: loadfile(const QString & fileName){
    QFile file(fileName);

    if(!file.open(QFile::ReadOnly | QFile::Text))

    {

    QMessageBox::warning(this,tr("读取文件"),tr("无法读取文件 %1:\n%2.").arg(fileName).arg(file.errorString()));

    return false;      //如果打开文件失败，弹出对话框，并返回

    }

    QTextStream in(&file);

    ui->textEdit->setText(in.readAll());      //将文件中的所有内容都写到文本编辑器中

    curfile =QFileInfo(fileName).canonicalFilePath();

    setWindowTitle(curfile);

    return true;
}

void MainWindow::on_actionNew_triggered()
{
    newFile();
}

void MainWindow::on_actionOpen_triggered()
{
    openfile();
}

void MainWindow::on_actionSave_triggered()
{
    saveFile();
}

void MainWindow::on_actionSaveAs_triggered()
{
     saveasFile();
}

void MainWindow::on_actionExit_triggered()
{
    on_actionClose_triggered();     //先执行关闭操作
    qApp->quit();    //再退出系统，qApp是指向应用程序的全局指针
}

void MainWindow::on_actionUndo_triggered()
{
    ui->textEdit->undo();
}

void MainWindow::on_actionRedo_triggered()
{
    ui->textEdit->redo();
}

void MainWindow::on_actionCut_triggered()
{
    ui->textEdit->cut();
}

void MainWindow::on_actionCopy_triggered()
{
   ui->textEdit->copy();
}

void MainWindow::on_actionPaste_triggered()
{
   ui->textEdit->paste();
   ui->textEdit->setVisible(false);
}

void MainWindow::on_actionClose_triggered()
{
     saveornotFile();
     ui->textEdit->setVisible(false);
}

void MainWindow::findtext()
{
 QString text=findlineedit->text () ;
 ui->textEdit->find(text, QTextDocument::FindBackward) ;
 if(!ui->textEdit->find(text,QTextDocument::FindBackward))
 {
  QMessageBox::warning(this,tr("find"),tr("can not find %1").arg(text));
 }
 }
void MainWindow::on_action_F_triggered()
{
QDialog *findD1g = new QDialog (this);
findD1g->setWindowTitle(tr("find"));
findlineedit=new QLineEdit(findD1g);
QPushButton *findpushputton=new QPushButton(tr("find next"),findD1g);
QVBoxLayout* layout = new QVBoxLayout (findD1g);
layout->addWidget (findlineedit) ;
layout->addWidget (findpushputton) ;
findD1g->show();
connect(findpushputton, SIGNAL(clicked()),this,SLOT(findtext()));
}

void MainWindow::on_actionAbout_triggered()
{
   //ui->textEdit->append(tr("19999131 刘娜"));
    QMessageBox::about(this,tr("作者"),tr("19999131 刘娜"));
}

#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QSqlQueryModel>
#include <QSqlTableModel>
#include <QSqlRelationalTableModel>
#include <QTableView>
#include <QDebug>
#include <QMessageBox>
#include <QSqlError>
MainWindow::MainWindow(QWidget *parent)
    : QMainWindow(parent)
    , ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    QSqlTableModel *model = new QSqlTableModel(this);
    model->setTable("student");
    model->select();
    model->setEditStrategy(QSqlTableModel::OnManualSubmit);
    ui->tableView->setModel(model);
}

MainWindow::~MainWindow()
{
    delete ui;
}


void MainWindow::on_pushButton_clicked()
{
    model->database().transaction();
    if(model->submitAll()){
        model->database().commit();
    }else{
        model->database().rollback();
        QMessageBox::warning(this,tr("tableModel"),
                             tr("数据库错误：%1").arg(model->lastError().text()));
    }
}

void MainWindow::on_pushButton_2_clicked()
{
    model->revertAll();
}

void MainWindow::on_pushButton_3_clicked()
{
    int rowNum = model->rowCount();
    // 添加一行
    model->insertRow(rowNum);

    model->setData(model->index(rowNum,0),rowNum);

}

void MainWindow::on_pushButton_4_clicked()
{
    int curRow = ui->tableView->currentIndex().row();
    // 删除该行
    model->removeRow(curRow);
    int ok = QMessageBox::warning(this,tr("删除当前行!"),	tr("你确定删除当前行吗？ "),QMessageBox::Yes, QMessageBox::No);
    if(ok == QMessageBox::No)
    { // 如果不删除，则撤销
    model->revertAll();	}

    else {
    // 否则提交，在数据库中删除该行
    model->submitAll();	}

}

void MainWindow::on_pushButton_7_clicked()
{
    QString name = ui->lineEdit->text();
    //根据姓名进行筛选，一定要使用单引号
    model->setFilter(QString("teacher = '%1'").arg(name));
    model->select();

}

void MainWindow::on_pushButton_8_clicked()
{
    model->setTable("course");
   model->select();

}

void MainWindow::on_pushButton_5_clicked()
{
    model->setSort(0, Qt::AscendingOrder);
    model->select();
}

void MainWindow::on_pushButton_6_clicked()
{
    model->setSort(0, Qt::DescendingOrder);	model->select();
}

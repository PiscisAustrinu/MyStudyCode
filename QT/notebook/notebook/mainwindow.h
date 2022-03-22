#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include<QString>
#include<QLineEdit>

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT
    
public:
    explicit MainWindow(QWidget *parent = 0);
    ~MainWindow();
    
private slots:



    void on_actionNew_triggered();

    void on_actionOpen_triggered();

    void on_actionSave_triggered();

    void on_actionSaveAs_triggered();

    void on_actionExit_triggered();

    void on_actionUndo_triggered();

    void on_actionRedo_triggered();

    void on_actionCut_triggered();

    void on_actionCopy_triggered();

    void on_actionPaste_triggered();

    void on_actionClose_triggered();
    void findtext();

    void on_action_F_triggered();

    void on_actionAbout_triggered();

private:
    Ui::MainWindow *ui;
    QLineEdit *findlineedit;
    bool isSaved;
    QString curfile;
    void newFile();
    void saveornotFile();
    void saveFile();
    void saveasFile();
    bool save(const QString &fileName);
    void openfile();
    bool loadfile(const QString & fileName);
};

#endif // MAINWINDOW_H

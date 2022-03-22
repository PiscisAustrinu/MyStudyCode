#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QLineEdit>
#include <QString>
QT_BEGIN_NAMESPACE
namespace Ui { class MainWindow; }
QT_END_NAMESPACE

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    MainWindow(QWidget *parent = nullptr);
    ~MainWindow();

private slots:
    void on_actionNew_triggered();

    void on_actionSave_triggered();

    void on_actionSaveAs_triggered();

    void on_actionOpen_triggered();

    void on_actionExit_triggered();

    void on_actionUndo_triggered();

    void on_actionRedo_triggered();

    void on_actionCut_triggered();

    void on_actionCopy_triggered();

    void on_actionPaste_triggered();

    void on_actionClose_triggered();

    void on_actionCloseAll_triggered();

    void on_actionTile_triggered();

    void on_actionCascade_triggered();

    void on_actionNext_triggered();

    void on_actionPrevious_triggered();

    void on_actionAbout_triggered();

    void on_actionAboutQt_triggered();

    void on_action_F_triggered();

    void on_textEdit_copyAvailable(bool b);

    void on_textEdit_currentCharFormatChanged(const QTextCharFormat &format);

private:
    Ui::MainWindow *ui;
    QLineEdit *findlineedit;
    bool isSaved;
    QString curFile();
    void newFile();
    void saveornotFile();
    void saveFile();
    void saveasFile();
    bool save(const QString& fileName);
    void openfile();
    bool loadfile(const QString& fileName);
};
#endif // MAINWINDOW_H

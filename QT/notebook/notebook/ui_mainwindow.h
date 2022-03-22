/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 4.8.6
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtGui/QApplication>
#include <QtGui/QButtonGroup>
#include <QtGui/QGridLayout>
#include <QtGui/QHeaderView>
#include <QtGui/QMainWindow>
#include <QtGui/QMenu>
#include <QtGui/QMenuBar>
#include <QtGui/QStatusBar>
#include <QtGui/QTextEdit>
#include <QtGui/QToolBar>
#include <QtGui/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QAction *actionNew;
    QAction *actionOpen;
    QAction *actionSave;
    QAction *actionSaveAs;
    QAction *actionExit;
    QAction *actionUndo;
    QAction *actionRedo;
    QAction *actionCut;
    QAction *actionCopy;
    QAction *actionPaste;
    QAction *actionClose;
    QAction *actionCloseAll;
    QAction *actionTile;
    QAction *actionCascade;
    QAction *actionNext;
    QAction *actionPrevious;
    QAction *actionAbout;
    QAction *actionAboutQt;
    QAction *action_F;
    QWidget *centralWidget;
    QGridLayout *gridLayout;
    QTextEdit *textEdit;
    QMenuBar *menuBar;
    QMenu *menu_F;
    QMenu *menu_E;
    QMenu *menu_W;
    QMenu *menu_H;
    QMenu *menu_F_2;
    QToolBar *mainToolBar;
    QStatusBar *statusBar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QString::fromUtf8("MainWindow"));
        MainWindow->resize(605, 516);
        actionNew = new QAction(MainWindow);
        actionNew->setObjectName(QString::fromUtf8("actionNew"));
        QIcon icon;
        icon.addFile(QString::fromUtf8("im/new.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionNew->setIcon(icon);
        actionOpen = new QAction(MainWindow);
        actionOpen->setObjectName(QString::fromUtf8("actionOpen"));
        QIcon icon1;
        icon1.addFile(QString::fromUtf8("im/open.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionOpen->setIcon(icon1);
        actionSave = new QAction(MainWindow);
        actionSave->setObjectName(QString::fromUtf8("actionSave"));
        QIcon icon2;
        icon2.addFile(QString::fromUtf8("im/save.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionSave->setIcon(icon2);
        actionSaveAs = new QAction(MainWindow);
        actionSaveAs->setObjectName(QString::fromUtf8("actionSaveAs"));
        QIcon icon3;
        icon3.addFile(QString::fromUtf8("im/saveAs.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionSaveAs->setIcon(icon3);
        actionExit = new QAction(MainWindow);
        actionExit->setObjectName(QString::fromUtf8("actionExit"));
        QIcon icon4;
        icon4.addFile(QString::fromUtf8("im/exit.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionExit->setIcon(icon4);
        actionUndo = new QAction(MainWindow);
        actionUndo->setObjectName(QString::fromUtf8("actionUndo"));
        QIcon icon5;
        icon5.addFile(QString::fromUtf8("im/undo.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionUndo->setIcon(icon5);
        actionRedo = new QAction(MainWindow);
        actionRedo->setObjectName(QString::fromUtf8("actionRedo"));
        QIcon icon6;
        icon6.addFile(QString::fromUtf8("im/redo.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionRedo->setIcon(icon6);
        actionCut = new QAction(MainWindow);
        actionCut->setObjectName(QString::fromUtf8("actionCut"));
        QIcon icon7;
        icon7.addFile(QString::fromUtf8("im/cut.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionCut->setIcon(icon7);
        actionCopy = new QAction(MainWindow);
        actionCopy->setObjectName(QString::fromUtf8("actionCopy"));
        QIcon icon8;
        icon8.addFile(QString::fromUtf8("im/copy.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionCopy->setIcon(icon8);
        actionPaste = new QAction(MainWindow);
        actionPaste->setObjectName(QString::fromUtf8("actionPaste"));
        QIcon icon9;
        icon9.addFile(QString::fromUtf8("im/paste.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionPaste->setIcon(icon9);
        actionClose = new QAction(MainWindow);
        actionClose->setObjectName(QString::fromUtf8("actionClose"));
        actionCloseAll = new QAction(MainWindow);
        actionCloseAll->setObjectName(QString::fromUtf8("actionCloseAll"));
        actionTile = new QAction(MainWindow);
        actionTile->setObjectName(QString::fromUtf8("actionTile"));
        actionCascade = new QAction(MainWindow);
        actionCascade->setObjectName(QString::fromUtf8("actionCascade"));
        actionNext = new QAction(MainWindow);
        actionNext->setObjectName(QString::fromUtf8("actionNext"));
        QIcon icon10;
        icon10.addFile(QString::fromUtf8("im/next.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionNext->setIcon(icon10);
        actionPrevious = new QAction(MainWindow);
        actionPrevious->setObjectName(QString::fromUtf8("actionPrevious"));
        QIcon icon11;
        icon11.addFile(QString::fromUtf8("im/previous.png"), QSize(), QIcon::Normal, QIcon::Off);
        actionPrevious->setIcon(icon11);
        actionAbout = new QAction(MainWindow);
        actionAbout->setObjectName(QString::fromUtf8("actionAbout"));
        actionAboutQt = new QAction(MainWindow);
        actionAboutQt->setObjectName(QString::fromUtf8("actionAboutQt"));
        action_F = new QAction(MainWindow);
        action_F->setObjectName(QString::fromUtf8("action_F"));
        centralWidget = new QWidget(MainWindow);
        centralWidget->setObjectName(QString::fromUtf8("centralWidget"));
        gridLayout = new QGridLayout(centralWidget);
        gridLayout->setSpacing(6);
        gridLayout->setContentsMargins(11, 11, 11, 11);
        gridLayout->setObjectName(QString::fromUtf8("gridLayout"));
        textEdit = new QTextEdit(centralWidget);
        textEdit->setObjectName(QString::fromUtf8("textEdit"));

        gridLayout->addWidget(textEdit, 0, 0, 1, 1);

        MainWindow->setCentralWidget(centralWidget);
        menuBar = new QMenuBar(MainWindow);
        menuBar->setObjectName(QString::fromUtf8("menuBar"));
        menuBar->setGeometry(QRect(0, 0, 605, 30));
        menu_F = new QMenu(menuBar);
        menu_F->setObjectName(QString::fromUtf8("menu_F"));
        menu_E = new QMenu(menuBar);
        menu_E->setObjectName(QString::fromUtf8("menu_E"));
        menu_W = new QMenu(menuBar);
        menu_W->setObjectName(QString::fromUtf8("menu_W"));
        menu_H = new QMenu(menuBar);
        menu_H->setObjectName(QString::fromUtf8("menu_H"));
        menu_F_2 = new QMenu(menuBar);
        menu_F_2->setObjectName(QString::fromUtf8("menu_F_2"));
        MainWindow->setMenuBar(menuBar);
        mainToolBar = new QToolBar(MainWindow);
        mainToolBar->setObjectName(QString::fromUtf8("mainToolBar"));
        MainWindow->addToolBar(Qt::TopToolBarArea, mainToolBar);
        statusBar = new QStatusBar(MainWindow);
        statusBar->setObjectName(QString::fromUtf8("statusBar"));
        MainWindow->setStatusBar(statusBar);

        menuBar->addAction(menu_F->menuAction());
        menuBar->addAction(menu_E->menuAction());
        menuBar->addAction(menu_W->menuAction());
        menuBar->addAction(menu_H->menuAction());
        menuBar->addAction(menu_F_2->menuAction());
        menu_F->addAction(actionNew);
        menu_F->addAction(actionOpen);
        menu_F->addAction(actionSave);
        menu_F->addAction(actionSaveAs);
        menu_F->addAction(actionExit);
        menu_E->addAction(actionUndo);
        menu_E->addAction(actionRedo);
        menu_E->addAction(actionCut);
        menu_E->addAction(actionCopy);
        menu_E->addAction(actionPaste);
        menu_W->addAction(actionClose);
        menu_W->addAction(actionCloseAll);
        menu_W->addAction(actionTile);
        menu_W->addAction(actionCascade);
        menu_W->addAction(actionNext);
        menu_W->addAction(actionPrevious);
        menu_H->addAction(actionAbout);
        menu_H->addAction(actionAboutQt);
        menu_F_2->addAction(action_F);
        mainToolBar->addAction(actionNew);
        mainToolBar->addAction(actionOpen);
        mainToolBar->addAction(actionSave);
        mainToolBar->addAction(actionSaveAs);
        mainToolBar->addAction(actionCut);
        mainToolBar->addAction(actionCopy);
        mainToolBar->addAction(actionPaste);
        mainToolBar->addAction(actionUndo);
        mainToolBar->addAction(actionRedo);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", 0, QApplication::UnicodeUTF8));
        actionNew->setText(QApplication::translate("MainWindow", "\346\226\260\345\273\272(&N)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionNew->setToolTip(QApplication::translate("MainWindow", "\346\226\260\345\273\272", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionNew->setShortcut(QApplication::translate("MainWindow", "Ctrl+N", 0, QApplication::UnicodeUTF8));
        actionOpen->setText(QApplication::translate("MainWindow", "\346\211\223\345\274\200\346\226\207\344\273\266(&O)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionOpen->setToolTip(QApplication::translate("MainWindow", "\346\211\223\345\274\200\346\226\207\344\273\266", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionSave->setText(QApplication::translate("MainWindow", "\344\277\235\345\255\230\346\226\207\344\273\266(&S)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionSave->setToolTip(QApplication::translate("MainWindow", "\344\277\235\345\255\230\346\226\207\344\273\266", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionSave->setShortcut(QApplication::translate("MainWindow", "Ctrl+S", 0, QApplication::UnicodeUTF8));
        actionSaveAs->setText(QApplication::translate("MainWindow", "\345\217\246\345\255\230\344\270\272\357\274\210&A\357\274\211", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionSaveAs->setToolTip(QApplication::translate("MainWindow", "\345\217\246\345\255\230\344\270\272", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionExit->setText(QApplication::translate("MainWindow", "\351\200\200\345\207\272(&X)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionExit->setToolTip(QApplication::translate("MainWindow", "\351\200\200\345\207\272", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionUndo->setText(QApplication::translate("MainWindow", "\346\222\244\351\224\200(&U)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionUndo->setToolTip(QApplication::translate("MainWindow", "\346\222\244\351\224\200", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionUndo->setShortcut(QApplication::translate("MainWindow", "Ctrl+Z", 0, QApplication::UnicodeUTF8));
        actionRedo->setText(QApplication::translate("MainWindow", "\346\201\242\345\244\215(&R)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionRedo->setToolTip(QApplication::translate("MainWindow", "\346\201\242\345\244\215", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionRedo->setShortcut(QApplication::translate("MainWindow", "Ctrl+Y", 0, QApplication::UnicodeUTF8));
        actionCut->setText(QApplication::translate("MainWindow", "\345\211\252\345\210\207(&T)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionCut->setToolTip(QApplication::translate("MainWindow", "\345\211\252\345\210\207", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionCut->setShortcut(QApplication::translate("MainWindow", "Ctrl+X", 0, QApplication::UnicodeUTF8));
        actionCopy->setText(QApplication::translate("MainWindow", "\345\244\215\345\210\266(&C)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionCopy->setToolTip(QApplication::translate("MainWindow", "\345\244\215\345\210\266", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionCopy->setShortcut(QApplication::translate("MainWindow", "Ctrl+C", 0, QApplication::UnicodeUTF8));
        actionPaste->setText(QApplication::translate("MainWindow", "\347\262\230\350\264\264(&P)", 0, QApplication::UnicodeUTF8));
        actionPaste->setShortcut(QApplication::translate("MainWindow", "Ctrl+V", 0, QApplication::UnicodeUTF8));
        actionClose->setText(QApplication::translate("MainWindow", "\345\205\263\351\227\255(&O)", 0, QApplication::UnicodeUTF8));
        actionCloseAll->setText(QApplication::translate("MainWindow", "\345\205\263\351\227\255\346\211\200\346\234\211\347\252\227\345\217\243(&A)", 0, QApplication::UnicodeUTF8));
        actionTile->setText(QApplication::translate("MainWindow", "\345\271\263\351\223\272(&T)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionTile->setToolTip(QApplication::translate("MainWindow", "\345\271\263\351\223\272", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionCascade->setText(QApplication::translate("MainWindow", "\345\261\202\345\217\240(&C)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionCascade->setToolTip(QApplication::translate("MainWindow", "\345\261\202\345\217\240", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionNext->setText(QApplication::translate("MainWindow", "\344\270\213\344\270\200\344\270\252(&X)", 0, QApplication::UnicodeUTF8));
        actionNext->setShortcut(QApplication::translate("MainWindow", "Ctrl+Tab", 0, QApplication::UnicodeUTF8));
        actionPrevious->setText(QApplication::translate("MainWindow", "\345\211\215\344\270\200\344\270\252(&V)", 0, QApplication::UnicodeUTF8));
#ifndef QT_NO_TOOLTIP
        actionPrevious->setToolTip(QApplication::translate("MainWindow", "\345\211\215\344\270\200\344\270\252", 0, QApplication::UnicodeUTF8));
#endif // QT_NO_TOOLTIP
        actionPrevious->setShortcut(QApplication::translate("MainWindow", "Ctrl+Shift+Backtab", 0, QApplication::UnicodeUTF8));
        actionAbout->setText(QApplication::translate("MainWindow", "\345\205\263\344\272\216(&A)", 0, QApplication::UnicodeUTF8));
        actionAboutQt->setText(QApplication::translate("MainWindow", "\345\205\263\344\272\216QT(&Q)", 0, QApplication::UnicodeUTF8));
        action_F->setText(QApplication::translate("MainWindow", "\346\237\245\346\211\276(&F)", 0, QApplication::UnicodeUTF8));
        menu_F->setTitle(QApplication::translate("MainWindow", "\346\226\207\344\273\266(&F)", 0, QApplication::UnicodeUTF8));
        menu_E->setTitle(QApplication::translate("MainWindow", "\347\274\226\350\276\221(&E)", 0, QApplication::UnicodeUTF8));
        menu_W->setTitle(QApplication::translate("MainWindow", "\347\252\227\345\217\243(W)", 0, QApplication::UnicodeUTF8));
        menu_H->setTitle(QApplication::translate("MainWindow", "\345\270\256\345\212\251\357\274\210&H\357\274\211", 0, QApplication::UnicodeUTF8));
        menu_F_2->setTitle(QApplication::translate("MainWindow", "\346\237\245\346\211\276(&F)", 0, QApplication::UnicodeUTF8));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H

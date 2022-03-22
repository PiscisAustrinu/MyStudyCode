/********************************************************************************
** Form generated from reading UI file 'mainwindow.ui'
**
** Created by: Qt User Interface Compiler version 5.9.9
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MAINWINDOW_H
#define UI_MAINWINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QMenuBar>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QStatusBar>
#include <QtWidgets/QTableView>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_MainWindow
{
public:
    QWidget *centralwidget;
    QTableView *tableView;
    QWidget *widget;
    QHBoxLayout *horizontalLayout;
    QLabel *label;
    QLineEdit *lineEdit;
    QWidget *widget1;
    QVBoxLayout *verticalLayout;
    QPushButton *pushButton;
    QPushButton *pushButton_2;
    QPushButton *pushButton_3;
    QPushButton *pushButton_4;
    QWidget *widget2;
    QVBoxLayout *verticalLayout_2;
    QPushButton *pushButton_7;
    QPushButton *pushButton_8;
    QWidget *widget3;
    QVBoxLayout *verticalLayout_3;
    QPushButton *pushButton_5;
    QPushButton *pushButton_6;
    QMenuBar *menubar;
    QStatusBar *statusbar;

    void setupUi(QMainWindow *MainWindow)
    {
        if (MainWindow->objectName().isEmpty())
            MainWindow->setObjectName(QStringLiteral("MainWindow"));
        MainWindow->resize(800, 600);
        centralwidget = new QWidget(MainWindow);
        centralwidget->setObjectName(QStringLiteral("centralwidget"));
        tableView = new QTableView(centralwidget);
        tableView->setObjectName(QStringLiteral("tableView"));
        tableView->setGeometry(QRect(0, 0, 491, 321));
        widget = new QWidget(centralwidget);
        widget->setObjectName(QStringLiteral("widget"));
        widget->setGeometry(QRect(80, 340, 255, 27));
        horizontalLayout = new QHBoxLayout(widget);
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        horizontalLayout->setContentsMargins(0, 0, 0, 0);
        label = new QLabel(widget);
        label->setObjectName(QStringLiteral("label"));

        horizontalLayout->addWidget(label);

        lineEdit = new QLineEdit(widget);
        lineEdit->setObjectName(QStringLiteral("lineEdit"));

        horizontalLayout->addWidget(lineEdit);

        widget1 = new QWidget(centralwidget);
        widget1->setObjectName(QStringLiteral("widget1"));
        widget1->setGeometry(QRect(540, 90, 114, 156));
        verticalLayout = new QVBoxLayout(widget1);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        verticalLayout->setContentsMargins(0, 0, 0, 0);
        pushButton = new QPushButton(widget1);
        pushButton->setObjectName(QStringLiteral("pushButton"));

        verticalLayout->addWidget(pushButton);

        pushButton_2 = new QPushButton(widget1);
        pushButton_2->setObjectName(QStringLiteral("pushButton_2"));

        verticalLayout->addWidget(pushButton_2);

        pushButton_3 = new QPushButton(widget1);
        pushButton_3->setObjectName(QStringLiteral("pushButton_3"));

        verticalLayout->addWidget(pushButton_3);

        pushButton_4 = new QPushButton(widget1);
        pushButton_4->setObjectName(QStringLiteral("pushButton_4"));

        verticalLayout->addWidget(pushButton_4);

        widget2 = new QWidget(centralwidget);
        widget2->setObjectName(QStringLiteral("widget2"));
        widget2->setGeometry(QRect(350, 340, 114, 76));
        verticalLayout_2 = new QVBoxLayout(widget2);
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        verticalLayout_2->setContentsMargins(0, 0, 0, 0);
        pushButton_7 = new QPushButton(widget2);
        pushButton_7->setObjectName(QStringLiteral("pushButton_7"));

        verticalLayout_2->addWidget(pushButton_7);

        pushButton_8 = new QPushButton(widget2);
        pushButton_8->setObjectName(QStringLiteral("pushButton_8"));

        verticalLayout_2->addWidget(pushButton_8);

        widget3 = new QWidget(centralwidget);
        widget3->setObjectName(QStringLiteral("widget3"));
        widget3->setGeometry(QRect(520, 320, 121, 76));
        verticalLayout_3 = new QVBoxLayout(widget3);
        verticalLayout_3->setObjectName(QStringLiteral("verticalLayout_3"));
        verticalLayout_3->setContentsMargins(0, 0, 0, 0);
        pushButton_5 = new QPushButton(widget3);
        pushButton_5->setObjectName(QStringLiteral("pushButton_5"));

        verticalLayout_3->addWidget(pushButton_5);

        pushButton_6 = new QPushButton(widget3);
        pushButton_6->setObjectName(QStringLiteral("pushButton_6"));

        verticalLayout_3->addWidget(pushButton_6);

        MainWindow->setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar->setObjectName(QStringLiteral("menubar"));
        menubar->setGeometry(QRect(0, 0, 800, 29));
        MainWindow->setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar->setObjectName(QStringLiteral("statusbar"));
        MainWindow->setStatusBar(statusbar);

        retranslateUi(MainWindow);

        QMetaObject::connectSlotsByName(MainWindow);
    } // setupUi

    void retranslateUi(QMainWindow *MainWindow)
    {
        MainWindow->setWindowTitle(QApplication::translate("MainWindow", "MainWindow", Q_NULLPTR));
        label->setText(QApplication::translate("MainWindow", "\345\247\223\345\220\215\357\274\232", Q_NULLPTR));
        lineEdit->setText(QApplication::translate("MainWindow", "1", Q_NULLPTR));
        pushButton->setText(QApplication::translate("MainWindow", "\346\217\220\344\272\244\344\277\256\346\224\271", Q_NULLPTR));
        pushButton_2->setText(QApplication::translate("MainWindow", "\346\222\244\351\224\200\344\277\256\346\224\271", Q_NULLPTR));
        pushButton_3->setText(QApplication::translate("MainWindow", "\346\267\273\345\212\240\350\256\260\345\275\225", Q_NULLPTR));
        pushButton_4->setText(QApplication::translate("MainWindow", "\345\210\240\351\231\244\351\200\211\344\270\255\350\241\214", Q_NULLPTR));
        pushButton_7->setText(QApplication::translate("MainWindow", "\346\237\245\350\257\242", Q_NULLPTR));
        pushButton_8->setText(QApplication::translate("MainWindow", "\346\230\276\347\244\272\345\205\250\350\241\250", Q_NULLPTR));
        pushButton_5->setText(QApplication::translate("MainWindow", "\346\214\211id\345\215\207\345\272\217\346\216\222\345\210\227", Q_NULLPTR));
        pushButton_6->setText(QApplication::translate("MainWindow", "\346\214\211id\351\231\215\345\272\217\346\216\222\345\210\227", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class MainWindow: public Ui_MainWindow {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MAINWINDOW_H

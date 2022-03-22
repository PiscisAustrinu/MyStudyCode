/********************************************************************************
** Form generated from reading UI file 'mywidget.ui'
**
** Created by: Qt User Interface Compiler version 5.9.9
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_MYWIDGET_H
#define UI_MYWIDGET_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QComboBox>
#include <QtWidgets/QFontComboBox>
#include <QtWidgets/QFormLayout>
#include <QtWidgets/QGridLayout>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpacerItem>
#include <QtWidgets/QSpinBox>
#include <QtWidgets/QTextEdit>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_myWidget
{
public:
    QGridLayout *gridLayout;
    QVBoxLayout *verticalLayout_2;
    QVBoxLayout *verticalLayout;
    QFormLayout *formLayout;
    QLabel *mLabel;
    QLineEdit *mLineEdit;
    QLabel *sLabel;
    QComboBox *sComboBox;
    QLabel *aLabel;
    QSpinBox *aSpinBox;
    QLabel *mLabel_2;
    QLineEdit *mLineEdit_2;
    QHBoxLayout *horizontalLayout;
    QFontComboBox *fontComboBox;
    QPushButton *pushButton;
    QTextEdit *textEdit;
    QSpacerItem *verticalSpacer;

    void setupUi(QWidget *myWidget)
    {
        if (myWidget->objectName().isEmpty())
            myWidget->setObjectName(QStringLiteral("myWidget"));
        myWidget->resize(800, 600);
        gridLayout = new QGridLayout(myWidget);
        gridLayout->setObjectName(QStringLiteral("gridLayout"));
        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        verticalLayout = new QVBoxLayout();
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        formLayout = new QFormLayout();
        formLayout->setObjectName(QStringLiteral("formLayout"));
        formLayout->setFieldGrowthPolicy(QFormLayout::ExpandingFieldsGrow);
        mLabel = new QLabel(myWidget);
        mLabel->setObjectName(QStringLiteral("mLabel"));

        formLayout->setWidget(0, QFormLayout::LabelRole, mLabel);

        mLineEdit = new QLineEdit(myWidget);
        mLineEdit->setObjectName(QStringLiteral("mLineEdit"));

        formLayout->setWidget(0, QFormLayout::FieldRole, mLineEdit);

        sLabel = new QLabel(myWidget);
        sLabel->setObjectName(QStringLiteral("sLabel"));

        formLayout->setWidget(1, QFormLayout::LabelRole, sLabel);

        sComboBox = new QComboBox(myWidget);
        sComboBox->setObjectName(QStringLiteral("sComboBox"));

        formLayout->setWidget(1, QFormLayout::FieldRole, sComboBox);

        aLabel = new QLabel(myWidget);
        aLabel->setObjectName(QStringLiteral("aLabel"));

        formLayout->setWidget(2, QFormLayout::LabelRole, aLabel);

        aSpinBox = new QSpinBox(myWidget);
        aSpinBox->setObjectName(QStringLiteral("aSpinBox"));

        formLayout->setWidget(2, QFormLayout::FieldRole, aSpinBox);

        mLabel_2 = new QLabel(myWidget);
        mLabel_2->setObjectName(QStringLiteral("mLabel_2"));

        formLayout->setWidget(3, QFormLayout::LabelRole, mLabel_2);

        mLineEdit_2 = new QLineEdit(myWidget);
        mLineEdit_2->setObjectName(QStringLiteral("mLineEdit_2"));

        formLayout->setWidget(3, QFormLayout::FieldRole, mLineEdit_2);


        verticalLayout->addLayout(formLayout);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        fontComboBox = new QFontComboBox(myWidget);
        fontComboBox->setObjectName(QStringLiteral("fontComboBox"));

        horizontalLayout->addWidget(fontComboBox);

        pushButton = new QPushButton(myWidget);
        pushButton->setObjectName(QStringLiteral("pushButton"));
        pushButton->setCheckable(true);

        horizontalLayout->addWidget(pushButton);


        verticalLayout->addLayout(horizontalLayout);


        verticalLayout_2->addLayout(verticalLayout);

        textEdit = new QTextEdit(myWidget);
        textEdit->setObjectName(QStringLiteral("textEdit"));

        verticalLayout_2->addWidget(textEdit);

        verticalSpacer = new QSpacerItem(20, 40, QSizePolicy::Minimum, QSizePolicy::Expanding);

        verticalLayout_2->addItem(verticalSpacer);


        gridLayout->addLayout(verticalLayout_2, 0, 0, 1, 1);

#ifndef QT_NO_SHORTCUT
        mLabel->setBuddy(mLineEdit);
        sLabel->setBuddy(sComboBox);
        mLabel_2->setBuddy(mLineEdit_2);
#endif // QT_NO_SHORTCUT

        retranslateUi(myWidget);

        QMetaObject::connectSlotsByName(myWidget);
    } // setupUi

    void retranslateUi(QWidget *myWidget)
    {
        myWidget->setWindowTitle(QApplication::translate("myWidget", "myWidget", Q_NULLPTR));
        mLabel->setText(QApplication::translate("myWidget", "\345\247\223\345\220\215(&M)", Q_NULLPTR));
        sLabel->setText(QApplication::translate("myWidget", "\346\200\247\345\210\253(&S)", Q_NULLPTR));
        aLabel->setText(QApplication::translate("myWidget", "\345\271\264\351\276\204(&A)", Q_NULLPTR));
        mLabel_2->setText(QApplication::translate("myWidget", "\351\202\256\347\256\261(&M)", Q_NULLPTR));
        pushButton->setText(QApplication::translate("myWidget", "\346\230\276\347\244\272\345\217\257\346\211\251\345\261\225\347\252\227\345\217\243", Q_NULLPTR));
    } // retranslateUi

};

namespace Ui {
    class myWidget: public Ui_myWidget {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_MYWIDGET_H

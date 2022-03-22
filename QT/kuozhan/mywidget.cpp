#include "mywidget.h"
#include "ui_mywidget.h"

myWidget::myWidget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::myWidget)
{
    ui->setupUi(this);
    ui->textEdit->hide();
}

myWidget::~myWidget()
{
    delete ui;
}


void myWidget::on_pushButton_toggled(bool checked)
{
   ui->textEdit->setVisible(checked);
   if(checked) ui->pushButton->setText(tr("隐藏可扩展窗口"));
   else ui->pushButton->setText(tr("显示可扩展窗口"));
}

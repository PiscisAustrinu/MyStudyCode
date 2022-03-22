#include "logindialog.h"
#include "ui_logindialog.h"
#include <QMessageBox>
LoginDialog::LoginDialog(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::LoginDialog)
{
    ui->setupUi(this);
}

LoginDialog::~LoginDialog()
{
    delete ui;
}

void LoginDialog::on_LoginpushButton_clicked()
{
    if(ui->UserlineEdit->text()==tr("Ylb")&&ui->PasswordlineEdit_2->text()==tr("520106"))
    {
    accept();
    }
    else
        QMessageBox::warning(this,tr("warning"),tr("username or password is wrong"),QMessageBox::Yes);
    ui->UserlineEdit->clear();
    ui->PasswordlineEdit_2->clear();
    ui->UserlineEdit->setFocus();
}

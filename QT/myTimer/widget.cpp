#include "widget.h"
#include "ui_widget.h"
#include<QTimer>
#include<QDateTime>
Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    timer = new QTimer(this);
    connect(timer, SIGNAL(timeout()), this, SLOT(timerUpdate()));
    qsrand(QTime(0, 0, 0).secsTo(QTime::currentTime()));
}

Widget::~Widget()
{
    delete ui;
}
void Widget::timerUpdate() {
//获取系统现在的时间
 QDateTime time = QDateTime::currentDateTime();
   //设置系统时间显示格式
   QString str = time.toString("yyyy-MM-dd hh:mm:ss dddd");
//在标签上显示时间
   ui->lineEdit->setText(str); int rand = qrand() % 5;
// 产生 5 以内随机整数:0-4
ui->label->setPixmap(QString("../myTimer/images/%1.png.jpg").arg(rand)); }


void Widget::on_pushButton_clicked()
{
    timer->start(1000);
}

void Widget::on_pushButton_2_clicked()
{
    timer->stop();
}

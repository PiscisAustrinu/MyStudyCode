#include "widget.h"
#include "ui_widget.h"
#include<QEvent>
#include<QDebug>
Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    MyLineEdit *lineEdit=new MyLineEdit(this);

    lineEdit->installEventFilter(this);
}

Widget::~Widget()
{
    delete ui;
}

bool Widget::eventFilter(QObject *obj, QEvent *event) // 事件过滤器
{
if(obj == lineEdit) {
// 如果是 lineEdit 部件上的事件
if(event->type() == QEvent::KeyPress)
qDebug() << tr("Widget 的事件过滤器");
}

return QWidget::eventFilter(obj, event);
}

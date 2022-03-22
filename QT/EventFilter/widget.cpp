#include "widget.h"
#include "ui_widget.h"
#include "mylineedit.h"
#include <QDebug>
Widget::Widget(QWidget *parent)
    : QWidget(parent)
    , ui(new Ui::Widget)
{
    ui->setupUi(this);
    MyLineEdit *lineEdit = new MyLineEdit(this);
    lineEdit->installEventFilter(this);
}

Widget::~Widget()
{
    delete ui;
}
bool Widget::eventFilter(QObject *obj, QEvent *event) // 事件过滤器
{

if(obj == lineEdit) { // 如 果 是 lineEdit 部 件 上 的 事 件
                    if(event->type() == QEvent::KeyPress)
                    qDebug() << tr("Widget 的事件过滤器");

}

return QWidget::eventFilter(obj, event);

}


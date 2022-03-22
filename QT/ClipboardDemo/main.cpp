#include "widget.h"
#include "clipboarddemo.h"
#include <QApplication>

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    Widget w;
    ClipboardDemo b;
    w.show();
    b.show();
    return a.exec();
}

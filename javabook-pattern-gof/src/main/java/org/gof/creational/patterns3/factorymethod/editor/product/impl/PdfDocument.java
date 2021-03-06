package org.gof.creational.patterns3.factorymethod.editor.product.impl;

import org.gof.creational.patterns3.factorymethod.editor.product.api.Document;

public class PdfDocument extends Document {

    public PdfDocument(){

    }

    @Override
    public void open() {
        System.out.println("打开Pdf档案" + this.getFile());
    }

    @Override
    public void display()  {
        System.out.println("显示Pdf档案" + this.getFile());
    }

    @Override
    public void save() {
        System.out.println("存储Pdf档案" + this.getFile());
    }

    @Override
    public void close() {
        System.out.println("关闭Pdf档案" + this.getFile());
    }
}

package com.kdgdev.javaedit.editor.detail;

import com.kdgdev.javaedit.editor.AbstractDetailPane;
import com.kdgdev.javaedit.editor.BrowserInternalFrame;
import com.kdgdev.javaedit.editor.BrowserServices;

import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AttributeGeneralPane extends AbstractDetailPane implements
        ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 3907856125379924109L;

    public AttributeGeneralPane(BrowserServices services) {
        super(services);
        BrowserInternalFrame internalFrame = (BrowserInternalFrame) services;
    }

    public void show(TreePath treePath) {

    }

    protected void setupComponent() {
    }

    public void actionPerformed(ActionEvent event) {


    }

}

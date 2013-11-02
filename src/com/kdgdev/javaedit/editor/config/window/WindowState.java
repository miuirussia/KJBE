/*
    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the license, or (at your option) any later version.
*/

package com.kdgdev.javaedit.editor.config.window;

/**
 * Complete serializable state of a <tt>BrowserComponent</tt>.
 *
 * @author <a href="mailto:jclasslib@ej-technologies.com">Ingo Kegel</a>
 * @version $Revision: 1.2 $ $Date: 2006/09/25 16:00:58 $
 */
public class WindowState {

    private String fileName;
    private BrowserPath browserPath;

    /**
     * Constructor.
     *
     * @param fileName    the file name for the displayed class.
     * @param browserPath the editor path that should be selected. May be <tt>null</tt>.
     */
    public WindowState(String fileName, BrowserPath browserPath) {
        this.fileName = fileName;
        this.browserPath = browserPath;
    }

    /**
     * Constructor.
     *
     * @param fileName the file name for the displayed class.
     */
    public WindowState(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Constructor.
     */
    public WindowState() {
    }

    /**
     * Get the file name of the displayed class.
     *
     * @return the file name.
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Set the file name of the displayed class.
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Get the editor path.
     *
     * @return the editor path.
     */
    public BrowserPath getBrowserPath() {
        return browserPath;
    }

    /**
     * Set the editor path.
     *
     * @param browserPath the editor path.
     */
    public void setBrowserPath(BrowserPath browserPath) {
        this.browserPath = browserPath;
    }

    public boolean equals(Object other) {

        return !(fileName == null || other == null || !(other instanceof WindowState)) && fileName.equals(((WindowState) other).fileName);
    }

    public int hashCode() {
        return fileName.hashCode();
    }
}

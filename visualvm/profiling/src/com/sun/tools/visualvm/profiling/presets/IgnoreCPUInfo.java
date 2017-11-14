/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sun.tools.visualvm.profiling.presets;

/**
 *
 * @author aoufdou
 */
public class IgnoreCPUInfo {
    
    private  Integer level=Integer.MAX_VALUE;
    private final String packageclass;
    private final String methode;

    public IgnoreCPUInfo(String packageclass, String methode) {
        this.packageclass = packageclass;
        this.methode = methode;
    }
    public IgnoreCPUInfo(Integer level,String packageclass, String methode) {
        this.packageclass = packageclass;
        this.methode = methode;
        if((level!=null) && (level>=0)){
            this.level=level;
        }

    }

    public Integer getLevel() {
        return level;
    }

    public String getPackageclass() {
        return packageclass;
    }

    public String getMethode() {
        return methode;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gia khang
 */
public class DiningTable {
    
    private int tableId;
    private int tableNumber;
    private String qrToken;
    private boolean enabled;

    public DiningTable() {
    }

    public DiningTable(int tableId, int tableNumber,
                       String qrToken, boolean enabled) {
        
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.qrToken = qrToken;
        this.enabled = enabled;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getQrToken() {
        return qrToken;
    }

    public void setQrToken(String qrToken) {
        this.qrToken = qrToken;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

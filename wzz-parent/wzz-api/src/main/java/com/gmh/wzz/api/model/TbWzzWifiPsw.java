package com.gmh.wzz.api.model;

import java.io.Serializable;
import java.util.Date;

public class TbWzzWifiPsw implements Serializable{

	private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_wifi_psw.WIFI_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String wifiId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_wifi_psw.PASSWORD
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_wifi_psw.MODIFY_TIME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_wifi_psw.WIFI_ID
     *
     * @return the value of tb_wzz_wifi_psw.WIFI_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getWifiId() {
        return wifiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_wifi_psw.WIFI_ID
     *
     * @param wifiId the value for tb_wzz_wifi_psw.WIFI_ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setWifiId(String wifiId) {
        this.wifiId = wifiId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_wifi_psw.PASSWORD
     *
     * @return the value of tb_wzz_wifi_psw.PASSWORD
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_wifi_psw.PASSWORD
     *
     * @param password the value for tb_wzz_wifi_psw.PASSWORD
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_wifi_psw.MODIFY_TIME
     *
     * @return the value of tb_wzz_wifi_psw.MODIFY_TIME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_wifi_psw.MODIFY_TIME
     *
     * @param modifyTime the value for tb_wzz_wifi_psw.MODIFY_TIME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
package com.gmh.wzz.api.model;

import java.io.Serializable;

public class TbWzzUser implements Serializable{

	private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_user.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_user.IMEI
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String imei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_wzz_user.USER_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_user.ID
     *
     * @return the value of tb_wzz_user.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_user.ID
     *
     * @param id the value for tb_wzz_user.ID
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_user.IMEI
     *
     * @return the value of tb_wzz_user.IMEI
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getImei() {
        return imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_user.IMEI
     *
     * @param imei the value for tb_wzz_user.IMEI
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_wzz_user.USER_NAME
     *
     * @return the value of tb_wzz_user.USER_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_wzz_user.USER_NAME
     *
     * @param userName the value for tb_wzz_user.USER_NAME
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
package com.gmh.wzz.core.dao;

import com.gmh.wzz.api.model.TbWzzWifiPsw;
import com.gmh.wzz.api.model.TbWzzWifiPswExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWzzWifiPswDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int countByExample(TbWzzWifiPswExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int deleteByExample(TbWzzWifiPswExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insert(TbWzzWifiPsw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insertSelective(TbWzzWifiPsw record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    List<TbWzzWifiPsw> selectByExample(TbWzzWifiPswExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbWzzWifiPsw record, @Param("example") TbWzzWifiPswExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_wifi_psw
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExample(@Param("record") TbWzzWifiPsw record, @Param("example") TbWzzWifiPswExample example);
}
package com.gmh.wzz.core.dao;

import com.gmh.wzz.api.model.TbWzzUser;
import com.gmh.wzz.api.model.TbWzzUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWzzUserDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int countByExample(TbWzzUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int deleteByExample(TbWzzUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insert(TbWzzUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int insertSelective(TbWzzUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    List<TbWzzUser> selectByExample(TbWzzUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    TbWzzUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExampleSelective(@Param("record") TbWzzUser record, @Param("example") TbWzzUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByExample(@Param("record") TbWzzUser record, @Param("example") TbWzzUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByPrimaryKeySelective(TbWzzUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_user
     *
     * @mbggenerated Sat Jun 27 09:02:03 CST 2015
     */
    int updateByPrimaryKey(TbWzzUser record);
}
package com.learning.springboot.mapper;

import com.learning.springboot.model.MemberInfo;
import com.learning.springboot.model.MemberInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int countByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int deleteByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int deleteByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int insert(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int insertSelective(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    List<MemberInfo> selectByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    MemberInfo selectByPrimaryKey(String guid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int updateByPrimaryKeySelective(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbggenerated Thu Oct 18 16:46:13 CST 2018
     */
    int updateByPrimaryKey(MemberInfo record);
}
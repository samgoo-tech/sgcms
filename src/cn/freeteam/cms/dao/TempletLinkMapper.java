package cn.freeteam.cms.dao;

import cn.freeteam.cms.model.TempletLink;
import cn.freeteam.cms.model.TempletLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempletLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int countByExample(TempletLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int deleteByExample(TempletLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int insert(TempletLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int insertSelective(TempletLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    List<TempletLink> selectByExample(TempletLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    TempletLink selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") TempletLink record, @Param("example") TempletLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int updateByExample(@Param("record") TempletLink record, @Param("example") TempletLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int updateByPrimaryKeySelective(TempletLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_templet_link
     *
     * @mbggenerated Wed May 08 20:34:56 CST 2013
     */
    int updateByPrimaryKey(TempletLink record);
}
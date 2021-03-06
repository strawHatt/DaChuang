package ssm.exc.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.exc.po.Advice;
import ssm.exc.po.AdviceExample;

public interface AdviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int countByExample(AdviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int deleteByExample(AdviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int deleteByPrimaryKey(Integer itemid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int insert(Advice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int insertSelective(Advice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    List<Advice> selectByExample(AdviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") Advice record, @Param("example") AdviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbggenerated Sat May 26 13:49:54 CST 2018
     */
    int updateByExample(@Param("record") Advice record, @Param("example") AdviceExample example);
}
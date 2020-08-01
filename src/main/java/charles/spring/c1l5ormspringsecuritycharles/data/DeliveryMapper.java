package charles.spring.c1l5ormspringsecuritycharles.data;

import charles.spring.c1l5ormspringsecuritycharles.model.Delivery;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DeliveryMapper {

    @Select("SELECT * FROM DELIVERY WHERE id = #{id}")
    Delivery findDelivery(Integer id);


    @Insert("INSERT INTO DELIVERY(orderId, time) VALUES(#{orderId}, #{time})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer AddDelivery(Delivery delivery);

    @Delete("DELETE FROM DELIVERY WHERE id = #{id}")
    void deleteDelivery(Integer id);

}

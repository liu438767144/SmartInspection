package com.whut.smartinspection.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Fortuner on 2017/12/12.
 * 巡视项目卡信息
 */
@Entity
public class PatrolWorkCard {

    @Property(nameInDb = "id")
    @Id(autoincrement = true)
    private Long id;

    private String idd;//巡视作业卡ID

    private String name;//作业卡名称

    private String typeName;//任务类型：全面巡视、运维......

    private String deviceId;//dpatrol_type_id

    private String otherColumn;//存储变电站信息


    @Generated(hash = 1946753628)
    public PatrolWorkCard(Long id, String idd, String name, String typeName,
            String deviceId, String otherColumn) {
        this.id = id;
        this.idd = idd;
        this.name = name;
        this.typeName = typeName;
        this.deviceId = deviceId;
        this.otherColumn = otherColumn;
    }

    @Generated(hash = 1730111227)
    public PatrolWorkCard() {
    }


    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getOtherColumn() {
        return otherColumn;
    }

    public void setOtherColumn(String otherColumn) {
        this.otherColumn = otherColumn;
    }
}

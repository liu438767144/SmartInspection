package com.whut.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.whut.smartinspection.model.DefectRegistrationRecord;
import com.whut.smartinspection.model.Device;
import com.whut.smartinspection.model.DeviceType;
import com.whut.smartinspection.model.IntervalUnit;
import com.whut.smartinspection.model.OpenDoorRecord;
import com.whut.smartinspection.model.PatrolContent;
import com.whut.smartinspection.model.PatrolTaskDetail;
import com.whut.smartinspection.model.PatrolWorkCard;
import com.whut.smartinspection.model.PerPatrolCard;
import com.whut.smartinspection.model.Person;
import com.whut.smartinspection.model.Record;
import com.whut.smartinspection.model.SluiceHeadPage;
import com.whut.smartinspection.model.SluiceOperationContent;
import com.whut.smartinspection.model.SluiceOperationRecord;
import com.whut.smartinspection.model.Sub;
import com.whut.smartinspection.model.TaskItem;
import com.whut.smartinspection.model.WholePatrolCard;
import com.whut.smartinspection.model.WholeSluiceCard;

import com.whut.greendao.gen.DefectRegistrationRecordDao;
import com.whut.greendao.gen.DeviceDao;
import com.whut.greendao.gen.DeviceTypeDao;
import com.whut.greendao.gen.IntervalUnitDao;
import com.whut.greendao.gen.OpenDoorRecordDao;
import com.whut.greendao.gen.PatrolContentDao;
import com.whut.greendao.gen.PatrolTaskDetailDao;
import com.whut.greendao.gen.PatrolWorkCardDao;
import com.whut.greendao.gen.PerPatrolCardDao;
import com.whut.greendao.gen.PersonDao;
import com.whut.greendao.gen.RecordDao;
import com.whut.greendao.gen.SluiceHeadPageDao;
import com.whut.greendao.gen.SluiceOperationContentDao;
import com.whut.greendao.gen.SluiceOperationRecordDao;
import com.whut.greendao.gen.SubDao;
import com.whut.greendao.gen.TaskItemDao;
import com.whut.greendao.gen.WholePatrolCardDao;
import com.whut.greendao.gen.WholeSluiceCardDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig defectRegistrationRecordDaoConfig;
    private final DaoConfig deviceDaoConfig;
    private final DaoConfig deviceTypeDaoConfig;
    private final DaoConfig intervalUnitDaoConfig;
    private final DaoConfig openDoorRecordDaoConfig;
    private final DaoConfig patrolContentDaoConfig;
    private final DaoConfig patrolTaskDetailDaoConfig;
    private final DaoConfig patrolWorkCardDaoConfig;
    private final DaoConfig perPatrolCardDaoConfig;
    private final DaoConfig personDaoConfig;
    private final DaoConfig recordDaoConfig;
    private final DaoConfig sluiceHeadPageDaoConfig;
    private final DaoConfig sluiceOperationContentDaoConfig;
    private final DaoConfig sluiceOperationRecordDaoConfig;
    private final DaoConfig subDaoConfig;
    private final DaoConfig taskItemDaoConfig;
    private final DaoConfig wholePatrolCardDaoConfig;
    private final DaoConfig wholeSluiceCardDaoConfig;

    private final DefectRegistrationRecordDao defectRegistrationRecordDao;
    private final DeviceDao deviceDao;
    private final DeviceTypeDao deviceTypeDao;
    private final IntervalUnitDao intervalUnitDao;
    private final OpenDoorRecordDao openDoorRecordDao;
    private final PatrolContentDao patrolContentDao;
    private final PatrolTaskDetailDao patrolTaskDetailDao;
    private final PatrolWorkCardDao patrolWorkCardDao;
    private final PerPatrolCardDao perPatrolCardDao;
    private final PersonDao personDao;
    private final RecordDao recordDao;
    private final SluiceHeadPageDao sluiceHeadPageDao;
    private final SluiceOperationContentDao sluiceOperationContentDao;
    private final SluiceOperationRecordDao sluiceOperationRecordDao;
    private final SubDao subDao;
    private final TaskItemDao taskItemDao;
    private final WholePatrolCardDao wholePatrolCardDao;
    private final WholeSluiceCardDao wholeSluiceCardDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        defectRegistrationRecordDaoConfig = daoConfigMap.get(DefectRegistrationRecordDao.class).clone();
        defectRegistrationRecordDaoConfig.initIdentityScope(type);

        deviceDaoConfig = daoConfigMap.get(DeviceDao.class).clone();
        deviceDaoConfig.initIdentityScope(type);

        deviceTypeDaoConfig = daoConfigMap.get(DeviceTypeDao.class).clone();
        deviceTypeDaoConfig.initIdentityScope(type);

        intervalUnitDaoConfig = daoConfigMap.get(IntervalUnitDao.class).clone();
        intervalUnitDaoConfig.initIdentityScope(type);

        openDoorRecordDaoConfig = daoConfigMap.get(OpenDoorRecordDao.class).clone();
        openDoorRecordDaoConfig.initIdentityScope(type);

        patrolContentDaoConfig = daoConfigMap.get(PatrolContentDao.class).clone();
        patrolContentDaoConfig.initIdentityScope(type);

        patrolTaskDetailDaoConfig = daoConfigMap.get(PatrolTaskDetailDao.class).clone();
        patrolTaskDetailDaoConfig.initIdentityScope(type);

        patrolWorkCardDaoConfig = daoConfigMap.get(PatrolWorkCardDao.class).clone();
        patrolWorkCardDaoConfig.initIdentityScope(type);

        perPatrolCardDaoConfig = daoConfigMap.get(PerPatrolCardDao.class).clone();
        perPatrolCardDaoConfig.initIdentityScope(type);

        personDaoConfig = daoConfigMap.get(PersonDao.class).clone();
        personDaoConfig.initIdentityScope(type);

        recordDaoConfig = daoConfigMap.get(RecordDao.class).clone();
        recordDaoConfig.initIdentityScope(type);

        sluiceHeadPageDaoConfig = daoConfigMap.get(SluiceHeadPageDao.class).clone();
        sluiceHeadPageDaoConfig.initIdentityScope(type);

        sluiceOperationContentDaoConfig = daoConfigMap.get(SluiceOperationContentDao.class).clone();
        sluiceOperationContentDaoConfig.initIdentityScope(type);

        sluiceOperationRecordDaoConfig = daoConfigMap.get(SluiceOperationRecordDao.class).clone();
        sluiceOperationRecordDaoConfig.initIdentityScope(type);

        subDaoConfig = daoConfigMap.get(SubDao.class).clone();
        subDaoConfig.initIdentityScope(type);

        taskItemDaoConfig = daoConfigMap.get(TaskItemDao.class).clone();
        taskItemDaoConfig.initIdentityScope(type);

        wholePatrolCardDaoConfig = daoConfigMap.get(WholePatrolCardDao.class).clone();
        wholePatrolCardDaoConfig.initIdentityScope(type);

        wholeSluiceCardDaoConfig = daoConfigMap.get(WholeSluiceCardDao.class).clone();
        wholeSluiceCardDaoConfig.initIdentityScope(type);

        defectRegistrationRecordDao = new DefectRegistrationRecordDao(defectRegistrationRecordDaoConfig, this);
        deviceDao = new DeviceDao(deviceDaoConfig, this);
        deviceTypeDao = new DeviceTypeDao(deviceTypeDaoConfig, this);
        intervalUnitDao = new IntervalUnitDao(intervalUnitDaoConfig, this);
        openDoorRecordDao = new OpenDoorRecordDao(openDoorRecordDaoConfig, this);
        patrolContentDao = new PatrolContentDao(patrolContentDaoConfig, this);
        patrolTaskDetailDao = new PatrolTaskDetailDao(patrolTaskDetailDaoConfig, this);
        patrolWorkCardDao = new PatrolWorkCardDao(patrolWorkCardDaoConfig, this);
        perPatrolCardDao = new PerPatrolCardDao(perPatrolCardDaoConfig, this);
        personDao = new PersonDao(personDaoConfig, this);
        recordDao = new RecordDao(recordDaoConfig, this);
        sluiceHeadPageDao = new SluiceHeadPageDao(sluiceHeadPageDaoConfig, this);
        sluiceOperationContentDao = new SluiceOperationContentDao(sluiceOperationContentDaoConfig, this);
        sluiceOperationRecordDao = new SluiceOperationRecordDao(sluiceOperationRecordDaoConfig, this);
        subDao = new SubDao(subDaoConfig, this);
        taskItemDao = new TaskItemDao(taskItemDaoConfig, this);
        wholePatrolCardDao = new WholePatrolCardDao(wholePatrolCardDaoConfig, this);
        wholeSluiceCardDao = new WholeSluiceCardDao(wholeSluiceCardDaoConfig, this);

        registerDao(DefectRegistrationRecord.class, defectRegistrationRecordDao);
        registerDao(Device.class, deviceDao);
        registerDao(DeviceType.class, deviceTypeDao);
        registerDao(IntervalUnit.class, intervalUnitDao);
        registerDao(OpenDoorRecord.class, openDoorRecordDao);
        registerDao(PatrolContent.class, patrolContentDao);
        registerDao(PatrolTaskDetail.class, patrolTaskDetailDao);
        registerDao(PatrolWorkCard.class, patrolWorkCardDao);
        registerDao(PerPatrolCard.class, perPatrolCardDao);
        registerDao(Person.class, personDao);
        registerDao(Record.class, recordDao);
        registerDao(SluiceHeadPage.class, sluiceHeadPageDao);
        registerDao(SluiceOperationContent.class, sluiceOperationContentDao);
        registerDao(SluiceOperationRecord.class, sluiceOperationRecordDao);
        registerDao(Sub.class, subDao);
        registerDao(TaskItem.class, taskItemDao);
        registerDao(WholePatrolCard.class, wholePatrolCardDao);
        registerDao(WholeSluiceCard.class, wholeSluiceCardDao);
    }
    
    public void clear() {
        defectRegistrationRecordDaoConfig.clearIdentityScope();
        deviceDaoConfig.clearIdentityScope();
        deviceTypeDaoConfig.clearIdentityScope();
        intervalUnitDaoConfig.clearIdentityScope();
        openDoorRecordDaoConfig.clearIdentityScope();
        patrolContentDaoConfig.clearIdentityScope();
        patrolTaskDetailDaoConfig.clearIdentityScope();
        patrolWorkCardDaoConfig.clearIdentityScope();
        perPatrolCardDaoConfig.clearIdentityScope();
        personDaoConfig.clearIdentityScope();
        recordDaoConfig.clearIdentityScope();
        sluiceHeadPageDaoConfig.clearIdentityScope();
        sluiceOperationContentDaoConfig.clearIdentityScope();
        sluiceOperationRecordDaoConfig.clearIdentityScope();
        subDaoConfig.clearIdentityScope();
        taskItemDaoConfig.clearIdentityScope();
        wholePatrolCardDaoConfig.clearIdentityScope();
        wholeSluiceCardDaoConfig.clearIdentityScope();
    }

    public DefectRegistrationRecordDao getDefectRegistrationRecordDao() {
        return defectRegistrationRecordDao;
    }

    public DeviceDao getDeviceDao() {
        return deviceDao;
    }

    public DeviceTypeDao getDeviceTypeDao() {
        return deviceTypeDao;
    }

    public IntervalUnitDao getIntervalUnitDao() {
        return intervalUnitDao;
    }

    public OpenDoorRecordDao getOpenDoorRecordDao() {
        return openDoorRecordDao;
    }

    public PatrolContentDao getPatrolContentDao() {
        return patrolContentDao;
    }

    public PatrolTaskDetailDao getPatrolTaskDetailDao() {
        return patrolTaskDetailDao;
    }

    public PatrolWorkCardDao getPatrolWorkCardDao() {
        return patrolWorkCardDao;
    }

    public PerPatrolCardDao getPerPatrolCardDao() {
        return perPatrolCardDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public RecordDao getRecordDao() {
        return recordDao;
    }

    public SluiceHeadPageDao getSluiceHeadPageDao() {
        return sluiceHeadPageDao;
    }

    public SluiceOperationContentDao getSluiceOperationContentDao() {
        return sluiceOperationContentDao;
    }

    public SluiceOperationRecordDao getSluiceOperationRecordDao() {
        return sluiceOperationRecordDao;
    }

    public SubDao getSubDao() {
        return subDao;
    }

    public TaskItemDao getTaskItemDao() {
        return taskItemDao;
    }

    public WholePatrolCardDao getWholePatrolCardDao() {
        return wholePatrolCardDao;
    }

    public WholeSluiceCardDao getWholeSluiceCardDao() {
        return wholeSluiceCardDao;
    }

}

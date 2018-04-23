package com.whut.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.whut.smartinspection.model.PatrolTaskDetail;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PATROL_TASK_DETAIL".
*/
public class PatrolTaskDetailDao extends AbstractDao<PatrolTaskDetail, Long> {

    public static final String TABLENAME = "PATROL_TASK_DETAIL";

    /**
     * Properties of entity PatrolTaskDetail.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "id");
        public final static Property TaskId = new Property(1, String.class, "taskId", false, "TASK_ID");
        public final static Property PatrolHeadPageId = new Property(2, String.class, "patrolHeadPageId", false, "PATROL_HEAD_PAGE_ID");
        public final static Property PatrolNameId = new Property(3, String.class, "patrolNameId", false, "PATROL_NAME_ID");
    }


    public PatrolTaskDetailDao(DaoConfig config) {
        super(config);
    }
    
    public PatrolTaskDetailDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PATROL_TASK_DETAIL\" (" + //
                "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TASK_ID\" TEXT," + // 1: taskId
                "\"PATROL_HEAD_PAGE_ID\" TEXT," + // 2: patrolHeadPageId
                "\"PATROL_NAME_ID\" TEXT);"); // 3: patrolNameId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PATROL_TASK_DETAIL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PatrolTaskDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(2, taskId);
        }
 
        String patrolHeadPageId = entity.getPatrolHeadPageId();
        if (patrolHeadPageId != null) {
            stmt.bindString(3, patrolHeadPageId);
        }
 
        String patrolNameId = entity.getPatrolNameId();
        if (patrolNameId != null) {
            stmt.bindString(4, patrolNameId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PatrolTaskDetail entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindString(2, taskId);
        }
 
        String patrolHeadPageId = entity.getPatrolHeadPageId();
        if (patrolHeadPageId != null) {
            stmt.bindString(3, patrolHeadPageId);
        }
 
        String patrolNameId = entity.getPatrolNameId();
        if (patrolNameId != null) {
            stmt.bindString(4, patrolNameId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PatrolTaskDetail readEntity(Cursor cursor, int offset) {
        PatrolTaskDetail entity = new PatrolTaskDetail( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // taskId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // patrolHeadPageId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // patrolNameId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PatrolTaskDetail entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTaskId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPatrolHeadPageId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPatrolNameId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PatrolTaskDetail entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PatrolTaskDetail entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PatrolTaskDetail entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

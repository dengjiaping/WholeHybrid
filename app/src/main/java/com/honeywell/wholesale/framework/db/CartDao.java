package com.honeywell.wholesale.framework.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "cart".
*/
public class CartDao extends AbstractDao<Cart, Long> {

    public static final String TABLENAME = "cart";

    /**
     * Properties of entity Cart.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property LoginName = new Property(1, String.class, "loginName", false, "login_name");
        public final static Property UserName = new Property(2, String.class, "userName", false, "user_name");
        public final static Property ShopId = new Property(3, String.class, "shopId", false, "shop_id");
        public final static Property CustomerId = new Property(4, String.class, "customerId", false, "customer_id");
        public final static Property CustomerName = new Property(5, String.class, "customerName", false, "customer_name");
        public final static Property ContactName = new Property(6, String.class, "contactName", false, "contact_name");
        public final static Property ContactPhone = new Property(7, String.class, "contactPhone", false, "contact_phone");
        public final static Property ContactNotes = new Property(8, String.class, "contactNotes", false, "customer_notes");
    }


    public CartDao(DaoConfig config) {
        super(config);
    }
    
    public CartDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"cart\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"login_name\" TEXT," + // 1: loginName
                "\"user_name\" TEXT," + // 2: userName
                "\"shop_id\" TEXT," + // 3: shopId
                "\"customer_id\" TEXT," + // 4: customerId
                "\"customer_name\" TEXT," + // 5: customerName
                "\"contact_name\" TEXT," + // 6: contactName
                "\"contact_phone\" TEXT," + // 7: contactPhone
                "\"customer_notes\" TEXT);"); // 8: contactNotes
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"cart\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Cart entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String loginName = entity.getLoginName();
        if (loginName != null) {
            stmt.bindString(2, loginName);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(4, shopId);
        }
 
        String customerId = entity.getCustomerId();
        if (customerId != null) {
            stmt.bindString(5, customerId);
        }
 
        String customerName = entity.getCustomerName();
        if (customerName != null) {
            stmt.bindString(6, customerName);
        }
 
        String contactName = entity.getContactName();
        if (contactName != null) {
            stmt.bindString(7, contactName);
        }
 
        String contactPhone = entity.getContactPhone();
        if (contactPhone != null) {
            stmt.bindString(8, contactPhone);
        }
 
        String contactNotes = entity.getContactNotes();
        if (contactNotes != null) {
            stmt.bindString(9, contactNotes);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Cart entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String loginName = entity.getLoginName();
        if (loginName != null) {
            stmt.bindString(2, loginName);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String shopId = entity.getShopId();
        if (shopId != null) {
            stmt.bindString(4, shopId);
        }
 
        String customerId = entity.getCustomerId();
        if (customerId != null) {
            stmt.bindString(5, customerId);
        }
 
        String customerName = entity.getCustomerName();
        if (customerName != null) {
            stmt.bindString(6, customerName);
        }
 
        String contactName = entity.getContactName();
        if (contactName != null) {
            stmt.bindString(7, contactName);
        }
 
        String contactPhone = entity.getContactPhone();
        if (contactPhone != null) {
            stmt.bindString(8, contactPhone);
        }
 
        String contactNotes = entity.getContactNotes();
        if (contactNotes != null) {
            stmt.bindString(9, contactNotes);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Cart readEntity(Cursor cursor, int offset) {
        Cart entity = new Cart( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // loginName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // shopId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // customerId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // customerName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // contactName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // contactPhone
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // contactNotes
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Cart entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLoginName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setShopId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCustomerId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCustomerName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setContactName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setContactPhone(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setContactNotes(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Cart entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Cart entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Cart entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

package com.cookmefsm.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cookmefsm.features.viewAllOrder.orderOptimized.CommonProductCatagory

@Dao
interface CompanyMasterDao {
    @Insert
    fun insert(vararg obj: CompanyMasterEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    abstract fun insertAll(kist: List<CompanyMasterEntity>)

    @Query("select * from company_master")
    fun getAll(): List<CompanyMasterEntity>
}
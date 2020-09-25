package com.example.android.house_list

import android.app.Application
import androidx.room.Database
import com.example.android.house_list.data.db.HousesDatabase
import com.example.android.house_list.data.db.HousesDatabase_Impl
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.android.x.kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.kcontext
import org.kodein.di.generic.singleton
import javax.sql.DataSource

class HouselistApplication : Application(), KodeinAware{
    override val kodein = Kodein.lazy {
        import(androidXModule(this@HouselistApplication))
        bind<HousesDatabase>() with singleton { HousesDatabase_Impl()}
    }
}
package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by admin on 2017/4/13.
 */

public class County extends DataSupport {
    private int id;
    //县名字
    private String countyName;
    //县对应的天气id
    private String weatherId;
    //当前县所属市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

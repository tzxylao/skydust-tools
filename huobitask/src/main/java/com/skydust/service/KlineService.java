package com.skydust.service;

import com.alibaba.fastjson.JSON;
import com.skydust.util.UrlUtils;

import java.util.List;

/**
 * 获取K线数据
 * period 参数	说明
 * 001	1分钟线
 * 005	5分钟
 * 015	15分钟
 * 030	30分钟
 * 060	60分钟
 * 100	日线
 * 200	周线
 * 300	月线
 * 400	年线
 * 例如	[BTC-CNY] http://api.huobi.com/staticmarket/btc_kline_005_json.js
 * [LTC-LTC] http://api.huobi.com/staticmarket/ltc_kline_005_json.js
 * [BTC-USD] http://api.huobi.com/usdmarket/btc_kline_005_json.js
 * length参数	说明
 * 1~2000	返回1~2000条数据，如果不传该参数默认为300条
 * 例如	[BTC-CNY] http://api.huobi.com/staticmarket/btc_kline_005_json.js?length=500
 * </td>
 * </tr>
 * </tbody>
 * Created by laoliangliang on 17/6/3.
 */
public class KlineService {
    public static List<List<Object>> getKlineData() {
        String klineStr = UrlUtils.loadJson("http://api.huobi.com/staticmarket/ltc_kline_005_json.js");
        List<List<Object>> data = JSON.parseObject(klineStr, List.class);
        return data;
    }

    public static void main(String[] args) {
        System.out.println(getKlineData());
    }
}

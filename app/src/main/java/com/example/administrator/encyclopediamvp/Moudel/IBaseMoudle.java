package com.example.administrator.encyclopediamvp.Moudel;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel
 * 文件名：   IBaseMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-15:47
 * 描述：
 */

public interface IBaseMoudle {
    ArrayList<?> ISerchKeyData(String SerchKey);
    ArrayList<?> INoSerchKeyData();
}

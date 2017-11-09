/*
 * 文件名：MasterDaoImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月9日
 */

package annotation.masterdao.impl;

import org.springframework.stereotype.Repository;

import annotation.masterdao.MasterDao;

@Repository
public class MasterDaoImpl implements MasterDao
{
    @Override
    public int login(String name, String password)
    {
        if ("scott".equals(name) && "tiger".equals(password))
        {
            return 1;
        }
        return 0;

    }
}

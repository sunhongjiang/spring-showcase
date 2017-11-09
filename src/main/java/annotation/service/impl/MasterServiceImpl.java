/*
 * 文件名：MasterServiceImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：JuliusRandle
 * 修改时间：2017年11月9日
 */

package annotation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import annotation.masterdao.MasterDao;
import annotation.service.MasterService;


@Service
public class MasterServiceImpl implements MasterService
{
    @Resource(name = "masterDaoImpl")
    private MasterDao masterDao;

    @Override
    public int login(String username, String password)
    {
        return this.masterDao.login(username, password);
    }
}

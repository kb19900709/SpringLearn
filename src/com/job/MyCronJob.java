package com.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.service.MenuService;

public class MyCronJob extends QuartzJobBean{
	
	private Logger logger = LoggerFactory.getLogger(MyCronJob.class); 
	
	private MenuService menuSrv;

	@Override
	protected void executeInternal(JobExecutionContext paramJobExecutionContext)
			throws JobExecutionException {
		logger.info("my cron job begin");
		try {
			menuSrv.menuJobTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMenuSrv(MenuService menuSrv){
		this.menuSrv = menuSrv;
	}

}

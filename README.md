# SpringBootPractice
springboot学习实践
ddddd
xxx
ssss
aa

// 只有金星、黑金才会注册生日周双倍积星活动
if (StringUtils.equals(taskInfo.getBaseTierName(), "Gold")
    || StringUtils.equals(taskInfo.getBaseTierName(), "Black")) {
    EnrollPromotionDTO enrollPromotionDTO = new EnrollPromotionDTO();
    enrollPromotionDTO.setMemberId(memberId);
    enrollPromotionDTO.setPromotionCode(loyaltyProperties.getPromotion().getPromoCode());
    enrollPromotionDTO.setStartTime(taskInfo.getTriggerDt());
    enrollPromotionDTO.setEndTime(taskInfo.getTriggerDt().plusDays(7));
    rulSetOptManager.enrollPromotion(enrollPromotionDTO);
    log.info("注册生日周双倍积星活动完成，memberId: {}", memberId);
}
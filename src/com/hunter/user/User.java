package com.hunter.user;

import java.util.Date;

//등록시 값이 부여됨..
public class User {
   String TAG = this.getClass().getName();
   private Member member; // 유저 중 멤버인 유저
   private Guest guest; // 유저 중 게스트인 유저

   private boolean flag = true; // 유저가 멤버인지, 게스트인지 알아보는 변수
   private int userId = 0; // 유저테이블 pk
   private int tableNum; // 테이블 번호 //연산할게 아니니까 string
   private int gender; // 성별
   private int total; // 총 인원수
   private Date date; // 입장 날짜 //디폴트 시스데이트
   // ip를 위해 추가
   private String tableIp;

 
   public User() {
	  
      System.out.println(TAG + " User.java가 메모리에 올라갔다.");
      // 유저 중 멤버와 게스트 메모리에 올리기
      guest = new Guest(this);
      member = new Member(this);
      setUserId(userId++);
   }

   // 멤버유저
   public Member getMemeber() {
      return member;
   }

   // 게스트유저
   public Guest getGuest() {
      return guest;
   }

   // 플래그 값 얻기
   public boolean getFlag() {
      return flag;
   }

   public void setFlag(boolean flag) {
      this.flag = flag;
   }

   // 유저테이블 pk얻기
   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   // 테이블
   public int getTableNum() {
      return tableNum;
   }

   public void setTableNum(int tableNum) {
      this.tableNum = tableNum;
   }

   // 성별
   public int getGender() {
      return gender;
   }

   public void setGender(int gender) {
      this.gender = gender;
   }

   // 총 인원
   public int getTotal() {
      return total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   // 날짜
   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   // tableIp
   public String getTableIp() {
      return tableIp;
   }

   public void setTableIp(String tableIp) {
      this.tableIp = tableIp;
   }
}
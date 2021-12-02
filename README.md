## 2021-12-02
## DTO
```
	private long b_number;
	private String b_writer;
	private String b_password;
	private String b_title;
	private String b_contents;
	private Timestamp b_date;
	private int b_hits;
```

## 테이블 정의
```
create table board_table(
	b_number bigint auto_increment,
    b_writer varchar(20),
    b_password varchar(20),
    b_title varchar(50),
    b_contents varchar(1000),
    b_date datetime,
    b_hits int default 0,
    constraint primary key(b_number)
);
```
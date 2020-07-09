




CREATE DATABASE JAVA;


CREATE TABLE `java`.`nhanvien` ( `HoTenNV` VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL , `NgaySinhNV` DATE NOT NULL , `GioiTinhNV` VARCHAR(5) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Nam' , `SdtNV` VARCHAR(15) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL , `CMNDNV` VARCHAR(30) NOT NULL , `EmailNV` VARCHAR(50) NOT NULL , `NgayBatDauNV` DATE NOT NULL , `MaNV` INT NOT NULL AUTO_INCREMENT , `TriGiaLuongNV` INT not null, PRIMARY KEY (`MaNV`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci;


CREATE TABLE `java`.`khachhang` ( `MaKH` INT NOT NULL AUTO_INCREMENT , `GioiTinhKH` VARCHAR(5) NOT NULL DEFAULT 'Nam' , `HoTenKH` VARCHAR(50) NOT NULL , `NgaySinhKH` DATE NOT NULL , `EmailKH` VARCHAR(50) NOT NULL , `SdtKh` VARCHAR(15) NOT NULL , PRIMARY KEY (`MaKH`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci;


CREATE TABLE `java`.`sanpham` ( `TenSP` VARCHAR(50) NOT NULL , `SizeSP` VARCHAR(1) NOT NULL , `GiaSP` VARCHAR(10) NOT NULL ) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci;


CREATE TABLE `java`.`hoadon` ( `MaHD` INT NOT NULL , `MaNV` INT NOT NULL , `MaKH` INT NOT NULL DEFAULT '-1' , `NgayHD` DATE NOT NULL , `GioHD` TIME NOT NULL , `Price` INT NOT NULL DEFAULT '0' , PRIMARY KEY (`MaHD`)) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci;


CREATE TABLE `java`.`cthd` ( `MaHD` INT NOT NULL , `TenSP` INT NOT NULL , `SL` INT NOT NULL DEFAULT '0' , `TriGia` INT NOT NULL ) ENGINE = InnoDB;


CREATE TABLE `java`.`luong` ( `MaNV` INT NOT NULL , `TongGioLam` INT NOT NULL DEFAULT '0' ) ENGINE = InnoDB;


CREATE TABLE `java`.`taikhoannv` ( `MaNV` INT NOT NULL , `TK` VARCHAR(50) NOT NULL , `MK` VARCHAR(50) NOT NULL, `ChucDanh` int not null ) ENGINE = InnoDB;
ALTER TABLE `taikhoannv` ADD UNIQUE( `TK`);


CREATE TABLE `java`.`datban` ( `SoBan` INT NOT NULL , `NgayDB` DATE NOT NULL , `GioDB` TIME NOT NULL , `TrangThaiDB` INT NOT NULL , `GhiChu` VARCHAR(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL ) ENGINE = InnoDB CHARSET=utf8 COLLATE utf8_unicode_ci;


CREATE TABLE `java`.`ban` ( `SoBan` INT NOT NULL ) ENGINE = InnoDB;

ALTER TABLE `ban` ADD PRIMARY KEY( `SoBan`);

/*Insert bảng bàn */
INSERT INTO `ban` (`SoBan`) VALUES (1), (2), (3), (4), (5), (6), (7), (8), (9);


/*insert bang nhan vien */
INSERT INTO `nhanvien` (`HoTenNV`, `NgaySinhNV`, `GioiTinhNV`, `SdtNV`, `CMNDNV`, `EmailNV`, `NgayBatDauNV`, `MaNV`, `TriGiaLuongNV`) VALUES ('Đinh Hoàng Tùng', '2000-09-10', 'Nam', '123456', '654321', '123456@gmail.com', '2020-07-07', NULL, '25000');
INSERT INTO `taikhoannv`(`MaNV`, `TK`, `MK`, `ChucDanh`) VALUES ((select MaNV from nhanvien ORDER by MaNV DESC limit 1),'tung','	c4ca4238a0b923820dcc509a6f75849b',1);
INSERT INTO `khachhang` (`MaKH`, `GioiTinhKH`, `HoTenKH`, `NgaySinhKH`, `EmailKH`, `SdtKh`) VALUES (NULL, 'Nam', 'Đinh Hoàng Tùng', '2000-09-10', '123456@gmail.com', '123456');
INSERT INTO `luong`(`MaNV`, `TongGioLam`) VALUES ((select MaNV from nhanvien ORDER by MaNV DESC limit 1), 0);


/* insert san pham */
INSERT INTO sanpham
(TenSP, SizeSP, GiaSP)
Values 
(N'Cafe đen', 'M' , '20000'),
(N'Cafe đen', 'L', '25000'),
(N'Cafe sữa đá', 'M' , '25000'),
(N'Cafe sữa đá', 'L' , '30000'),
(N'Capuccino','R', '30000'),
(N'Cacao nóng', 'R', '30000'),
(N'Sinh tố bơ', 'M' , '20000'),
(N'Sinh tố bơ', 'L' , '25000'),
(N'Sinh sapoche', 'M' , '15000'),
(N'Sinh sapoche', 'L' , '20000'),
(N'Sinh dưa hấu', 'M' , '15000'),
(N'Sinh dưa hấu', 'L' , '20000'),
(N'Sinh tố dâu', 'M' , '20000'),
(N'Sinh tố dâu', 'L' , '25000'),
(N'Cookie đá xay','M', '27000' ),
(N'Cookie đá xay','L', '33000' ),
(N'Cookie matcha', 'M', '2.00'),
(N'Cookie matcha','L', '33000' ),
(N'Nước ép thơm', 'M','15000' ),
(N'Nước ép thơm', 'L','20000' ),
(N'Nước ép dưa hấu', 'M','15000' ),
(N'Nước ép dưa hấu', 'L','20000' ),
(N'Nước ép cà rốt', 'M','15000' ),
(N'Nước ép cà rốt', 'L','20000' ),
(N'Soda Dâu', 'M','15000' ),
(N'Soda Dâu', 'L','20000' ),
(N'Soda Bac Hà', 'M','15000' ),
(N'Soda Bac Hà' , 'L','20000'),
(N'Nước lọc', 'C', '10.000')
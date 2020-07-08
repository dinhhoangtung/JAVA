-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th7 07, 2020 lúc 10:29 AM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlcafe`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `MANV` varchar(5) NOT NULL,
  `MAHD` varchar(5) NOT NULL,
  `MASP` varchar(5) NOT NULL,
  `SOLUONG` varchar(5) NOT NULL,
  `DONGIA` varchar(20) NOT NULL,
  `MAKH` varchar(5) NOT NULL,
  `LOAIKH` varchar(20) NOT NULL,
  `DISCOUNT` varchar(50) NOT NULL,
  `THOIGIAN` date NOT NULL,
  `THANHTIEN` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`MANV`, `MAHD`, `MASP`, `SOLUONG`, `DONGIA`, `MAKH`, `LOAIKH`, `DISCOUNT`, `THOIGIAN`, `THANHTIEN`) VALUES
('NV01', 'HD01', 'SP01', '1', '10000', 'KH01', 'VIP', '0', '2020-06-25', '10000');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `MAKH` varchar(5) NOT NULL,
  `TENKH` varchar(20) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `GIOITINH` varchar(3) NOT NULL,
  `CMND` varchar(10) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `NGAYDK` date NOT NULL,
  `LOAIKH` varchar(10) NOT NULL,
  `GHICHU` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`MAKH`, `TENKH`, `NGAYSINH`, `GIOITINH`, `CMND`, `SDT`, `EMAIL`, `NGAYDK`, `LOAIKH`, `GHICHU`) VALUES
('kh01', 'Nguyễn Văn Tèo', '2020-06-08', 'Nam', '123123142', '12421412412', '1241@gmail.com', '2020-06-25', 'VIP', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `luong`
--

CREATE TABLE `luong` (
  `MANV` varchar(5) NOT NULL,
  `TENNV` varchar(20) NOT NULL,
  `GIOITINH` varchar(3) NOT NULL,
  `NGAYBD` date NOT NULL,
  `THOIGIAN` date NOT NULL,
  `GIOLAMVIEC` varchar(4) NOT NULL,
  `BOPHAN` varchar(50) NOT NULL,
  `LUONG` varchar(30) NOT NULL,
  `GHICHU` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `luong`
--

INSERT INTO `luong` (`MANV`, `TENNV`, `GIOITINH`, `NGAYBD`, `THOIGIAN`, `GIOLAMVIEC`, `BOPHAN`, `LUONG`, `GHICHU`) VALUES
('NV01', 'Hồ Hữu Thắng', 'Nam', '2020-06-26', '2020-07-01', '100', 'Bảo Vệ', '10000000', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MANV` varchar(5) NOT NULL,
  `TENNV` varchar(20) NOT NULL,
  `GIOITINH` varchar(3) NOT NULL,
  `NGAYSINH` date NOT NULL,
  `CMND` varchar(9) NOT NULL,
  `SDT` varchar(11) NOT NULL,
  `EMAIL` varchar(50) NOT NULL,
  `NGAYBATDAU` date NOT NULL,
  `TRANGTHAI` varchar(50) NOT NULL,
  `GHICHU` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MANV`, `TENNV`, `GIOITINH`, `NGAYSINH`, `CMND`, `SDT`, `EMAIL`, `NGAYBATDAU`, `TRANGTHAI`, `GHICHU`) VALUES
('NV01', 'Hồ Hữu Thắng', 'Nam', '2000-07-08', '272763261', '0386722165', 'asd@gmail.com', '2020-06-26', 'Đang làm việc', '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MAHD`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MAKH`);

--
-- Chỉ mục cho bảng `luong`
--
ALTER TABLE `luong`
  ADD PRIMARY KEY (`MANV`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MANV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;








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
INSERT INTO `ban` (`SoBan`) VALUES (1), (2), (3), (4), (5), (6), (7), (8), (9)


/*insert bang nhan vien */
INSERT INTO `nhanvien` (`HoTenNV`, `NgaySinhNV`, `GioiTinhNV`, `SdtNV`, `CMNDNV`, `EmailNV`, `NgayBatDauNV`, `MaNV`, `TriGiaLuongNV`) VALUES ('Đinh Hoàng Tùng', '2000-09-10', 'Nam', '123456', '654321', '123456@gmail.com', '2020-07-07', NULL, '25000');
INSERT INTO `taikhoannv`(`MaNV`, `TK`, `MK`, `ChucDanh`) VALUES ((select MaNV from nhanvien ORDER by MaNV DESC limit 1),'tung','	c4ca4238a0b923820dcc509a6f75849b',1)
INSERT INTO `khachhang` (`MaKH`, `GioiTinhKH`, `HoTenKH`, `NgaySinhKH`, `EmailKH`, `SdtKh`) VALUES (NULL, 'Nam', 'Đinh Hoàng Tùng', '2000-09-10', '123456@gmail.com', '123456');
INSERT INTO `luong`(`MaNV`, `TongGioLam`) VALUES ((select MaNV from nhanvien ORDER by MaNV DESC limit 1), 0)


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
/**
 Bài 47: Hiểu rõ về gói - Package trong lập trình Java

 Một gói thư viện là tập lợp các lớp , các giao tiếp , các kiểu liệt kê và các chú thích
 Nó cung cấp các chức năng bảo vệ truy cập và quản lý không gian tên
 Thao tác trên gói có 2 kỹ thuật
 - kỹ thuật đặt tên
 - Kỹ thuật điều khiển truy xuất
 Một gói là một nhóm các lớp và giao tiếp có quan hện với nhau được tổ chức như 1 đơn  vị trong không gian tên
 Gói giúp phân hoạch không gian tên lớp , giao diện thành những  vùng dễ quản lý hơn

 Đặc điểm có gói
 - Một gói có thể có nhiều gói con
 - Không được có 2 thành viên trùng tên
 - Tên của gói được viết bằng chữ thường
 - Java có 2 loại gói
 - Gói được định nghĩa trước
 - Gói được định nghĩa bới người dùng

 Định nghĩa gói
 - Để tạo 1 gói ta đặt từ khoá package ngay sau phat biểu đầu tiên của tập tin nguồn
 - Nếu bỏ qua khai báo package -> lớp sẽ được đặt vào gói mặc định
 package packageName

 Các bước định nghĩa gói
 Bước1: Lựa chọn tên gói
 - Tên gói phải là chữ thường
 - Tên gói không được bắt đầu bằng java hoặc javax
 - Không được bắt đầu bằng số hoặc dấu nối -

 Bước2: Tạo thư mục cùng tên với gói
 - Java sử dụng hệ thống thư mục để lưu trữ các gói -> Các lớp được chứa trong thư mục cùng tên packageName

 Bước3: Đưa tập tin nguồn vào trong gói
 - Thêm câu lệnh package vào dòng đầu tiên của mã nguồn
 - Chỉ có duy nhất 1 câu lệnh package đối với mỗi tập nguồn

 Bước4: biên dịch và chạy ứng dụng
 - Khi biên dịch phải đảm bảo sử dụng tên lớp đầy đủ bao gồm cả tên gói
 - Dùng dấu chấm để phân biệt một package với package cha của nó

Trong các package khác nhau có thể có các class trùng tên giống nhau
 Trong package có thể chứa package con

 Tóm lại :
 package cách để chia nhỏ dự án ra các khu vực các vùng khác nhau
 class ở package A sẽ khác class ở package B dù chúng có tên giống nhau
 */
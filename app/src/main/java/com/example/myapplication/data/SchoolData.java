package com.example.myapplication.data;

import com.example.myapplication.models.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolData {

    public static List<School> getSampleSchools() {
        List<School> schools = new ArrayList<>();

        // ========== KHU VỰC BẮC ==========
        
        // 1. ĐH Bách Khoa Hà Nội
        School bkhn = new School("1", "Đại học Bách Khoa Hà Nội", "ĐHBK HN", "Bắc", "Công lập");
        bkhn.setAddress("Số 1 Đại Cồ Việt, Hai Bà Trưng, Hà Nội");
        bkhn.setPhone("024 3869 4242");
        bkhn.setEmail("dhbk@hust.edu.vn");
        bkhn.setWebsite("https://www.hust.edu.vn");
        bkhn.setDescription("Trường Đại học Bách khoa Hà Nội là trường đại học kỹ thuật đầu tiên và lâu đời nhất ở Việt Nam, được thành lập năm 1956.");
        bkhn.setImages(Arrays.asList("https://example.com/bkhn1.jpg", "https://example.com/bkhn2.jpg"));
        bkhn.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kỹ thuật phần mềm", "Kỹ thuật cơ khí", 
            "Kỹ thuật điện tử", "Kỹ thuật hóa học", "Kiến trúc"
        ));
        bkhn.setTuitionRange("10 - 15 triệu/năm");
        bkhn.setFacilities(Arrays.asList(
            "Thư viện hiện đại với hơn 500,000 đầu sách",
            "18 phòng thí nghiệm chuyên sâu",
            "Ký túc xá cho 5,000 sinh viên",
            "Sân vận động đa năng"
        ));
        bkhn.setClubs(Arrays.asList("CLB Robotics", "CLB AI", "CLB Tiếng Anh", "CLB Bóng đá"));
        bkhn.setAdmissionPolicy("Tuyển sinh dựa trên kết quả thi THPT Quốc gia, ưu tiên học sinh giỏi Toán, Lý, Hóa.");
        Map<String, Double> bkhnScores = new HashMap<>();
        bkhnScores.put("Công nghệ thông tin", 28.5);
        bkhnScores.put("Kỹ thuật cơ khí", 27.0);
        bkhnScores.put("Kiến trúc", 29.0);
        bkhn.setBenchmarkScores(bkhnScores);
        bkhn.setAdmissionQuota("5,500 chỉ tiêu");
        bkhn.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Tuyển thẳng học sinh giỏi"));
        schools.add(bkhn);

        // 2. ĐH Quốc gia Hà Nội
        School vnu = new School("2", "Đại học Quốc gia Hà Nội", "ĐHQG HN", "Bắc", "Công lập");
        vnu.setAddress("144 Xuân Thủy, Cầu Giấy, Hà Nội");
        vnu.setPhone("024 3754 7506");
        vnu.setEmail("dhqghn@vnu.edu.vn");
        vnu.setWebsite("https://www.vnu.edu.vn");
        vnu.setDescription("Đại học Quốc gia Hà Nội là một trong hai đại học quốc gia của Việt Nam, tập hợp nhiều trường thành viên uy tín.");
        vnu.setImages(Arrays.asList("https://example.com/vnu1.jpg"));
        vnu.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kinh tế", "Ngôn ngữ Anh", 
            "Quản trị kinh doanh", "Khoa học dữ liệu", "Luật"
        ));
        vnu.setTuitionRange("8 - 12 triệu/năm");
        vnu.setFacilities(Arrays.asList(
            "Hệ thống thư viện liên kết 6 trường",
            "Phòng lab công nghệ cao",
            "Trung tâm ngoại ngữ quốc tế"
        ));
        vnu.setClubs(Arrays.asList("CLB Khởi nghiệp", "CLB Văn hóa", "CLB Thể thao"));
        vnu.setAdmissionPolicy("Tuyển sinh đa dạng: điểm thi, học bạ, năng khiếu.");
        Map<String, Double> vnuScores = new HashMap<>();
        vnuScores.put("Công nghệ thông tin", 27.5);
        vnuScores.put("Kinh tế", 26.0);
        vnu.setBenchmarkScores(vnuScores);
        vnu.setAdmissionQuota("8,000 chỉ tiêu");
        vnu.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Thi đánh giá năng lực"));
        schools.add(vnu);

        // 3. ĐH FPT
        School fpt = new School("3", "Đại học FPT", "ĐH FPT", "Bắc", "Dân lập");
        fpt.setAddress("Khu Công nghệ cao Hòa Lạc, Hà Nội");
        fpt.setPhone("024 7300 5588");
        fpt.setEmail("admissions@fpt.edu.vn");
        fpt.setWebsite("https://university.fpt.edu.vn");
        fpt.setDescription("Đại học FPT là trường đại học tư thục hàng đầu Việt Nam về công nghệ thông tin và kinh doanh.");
        fpt.setImages(Arrays.asList("https://example.com/fpt1.jpg", "https://example.com/fpt2.jpg"));
        fpt.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kỹ thuật phần mềm", "An toàn thông tin",
            "Marketing", "Quản trị kinh doanh", "Thiết kế đồ họa"
        ));
        fpt.setTuitionRange("50 - 70 triệu/năm");
        fpt.setFacilities(Arrays.asList(
            "Campus hiện đại phong cách Mỹ",
            "Phòng lab Apple, Microsoft, Cisco",
            "Ký túc xá 4 sao",
            "Sân golf mini"
        ));
        fpt.setClubs(Arrays.asList("CLB Game Dev", "CLB Marketing", "CLB Dance", "CLB Bóng rổ"));
        fpt.setAdmissionPolicy("Tuyển sinh linh hoạt, không yêu cầu điểm chuẩn cao, tập trung vào năng lực thực hành.");
        Map<String, Double> fptScores = new HashMap<>();
        fptScores.put("Công nghệ thông tin", 18.0);
        fptScores.put("Marketing", 17.5);
        fpt.setBenchmarkScores(fptScores);
        fpt.setAdmissionQuota("3,000 chỉ tiêu");
        fpt.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Phỏng vấn trực tiếp"));
        schools.add(fpt);

        // ========== KHU VỰC TRUNG ==========

        // 4. ĐH Đà Nẵng
        School dnu = new School("4", "Đại học Đà Nẵng", "ĐH Đà Nẵng", "Trung", "Công lập");
        dnu.setAddress("41 Lê Duẩn, Hải Châu, Đà Nẵng");
        dnu.setPhone("0236 3822 041");
        dnu.setEmail("info@ud.edu.vn");
        dnu.setWebsite("https://www.ud.edu.vn");
        dnu.setDescription("Đại học Đà Nẵng là đại học vùng trọng điểm miền Trung, đào tạo đa ngành nghề chất lượng cao.");
        dnu.setImages(Arrays.asList("https://example.com/dnu1.jpg"));
        dnu.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kỹ thuật phần mềm", "Kinh tế",
            "Du lịch", "Ngoại ngữ", "Y khoa"
        ));
        dnu.setTuitionRange("9 - 13 triệu/năm");
        dnu.setFacilities(Arrays.asList(
            "Thư viện 5 tầng hiện đại",
            "Khu thực hành y khoa",
            "Trung tâm ngoại ngữ"
        ));
        dnu.setClubs(Arrays.asList("CLB Du lịch", "CLB Tiếng Anh", "CLB Cầu lông"));
        dnu.setAdmissionPolicy("Tuyển sinh theo điểm thi THPT và học bạ THPT.");
        Map<String, Double> dnuScores = new HashMap<>();
        dnuScores.put("Công nghệ thông tin", 25.0);
        dnuScores.put("Y khoa", 27.5);
        dnu.setBenchmarkScores(dnuScores);
        dnu.setAdmissionQuota("4,500 chỉ tiêu");
        dnu.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ"));
        schools.add(dnu);

        // 5. ĐH Huế
        School hue = new School("5", "Đại học Huế", "ĐH Huế", "Trung", "Công lập");
        hue.setAddress("03 Lê Lợi, Thành phố Huế");
        hue.setPhone("0234 3822 044");
        hue.setEmail("dhh@hueuni.edu.vn");
        hue.setWebsite("https://www.hueuni.edu.vn");
        hue.setDescription("Đại học Huế là trường đại học danh tiếng tại cố đô, nổi tiếng về y dược và khoa học xã hội.");
        hue.setImages(Arrays.asList("https://example.com/hue1.jpg"));
        hue.setMajors(Arrays.asList(
            "Y khoa", "Dược học", "Sư phạm", 
            "Lịch sử", "Văn học", "Kinh tế"
        ));
        hue.setTuitionRange("8 - 15 triệu/năm");
        hue.setFacilities(Arrays.asList(
            "Bệnh viện thực hành Y khoa",
            "Thư viện cổ",
            "Khu vực thực hành dược"
        ));
        hue.setClubs(Arrays.asList("CLB Y tế cộng đồng", "CLB Văn học", "CLB Bóng đá"));
        hue.setAdmissionPolicy("Ưu tiên học sinh có điểm cao môn Hóa, Sinh (ngành Y Dược).");
        Map<String, Double> hueScores = new HashMap<>();
        hueScores.put("Y khoa", 28.0);
        hueScores.put("Dược học", 26.5);
        hue.setBenchmarkScores(hueScores);
        hue.setAdmissionQuota("3,800 chỉ tiêu");
        hue.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ"));
        schools.add(hue);

        // ========== KHU VỰC NAM ==========

        // 6. ĐH Bách Khoa TP.HCM
        School hcmut = new School("6", "Đại học Bách Khoa TP.HCM", "ĐHBK HCM", "Nam", "Công lập");
        hcmut.setAddress("268 Lý Thường Kiệt, Quận 10, TP.HCM");
        hcmut.setPhone("028 3865 4633");
        hcmut.setEmail("ttdt@hcmut.edu.vn");
        hcmut.setWebsite("https://www.hcmut.edu.vn");
        hcmut.setDescription("Trường Đại học Bách khoa TP.HCM là trường kỹ thuật hàng đầu miền Nam, nổi tiếng về công nghệ và kỹ thuật.");
        hcmut.setImages(Arrays.asList("https://example.com/hcmut1.jpg"));
        hcmut.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kỹ thuật cơ khí", "Kỹ thuật điện",
            "Kỹ thuật hóa học", "Kiến trúc", "Khoa học máy tính"
        ));
        hcmut.setTuitionRange("10 - 14 triệu/năm");
        hcmut.setFacilities(Arrays.asList(
            "19 phòng thí nghiệm chuyên ngành",
            "Thư viện điện tử",
            "Trung tâm nghiên cứu AI"
        ));
        hcmut.setClubs(Arrays.asList("CLB Robotics", "CLB Lập trình", "CLB Bóng đá"));
        hcmut.setAdmissionPolicy("Tuyển sinh theo kết quả thi THPT, ưu tiên khối A, A1.");
        Map<String, Double> hcmutScores = new HashMap<>();
        hcmutScores.put("Công nghệ thông tin", 27.5);
        hcmutScores.put("Kỹ thuật cơ khí", 26.5);
        hcmut.setBenchmarkScores(hcmutScores);
        hcmut.setAdmissionQuota("6,000 chỉ tiêu");
        hcmut.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Tuyển thẳng"));
        schools.add(hcmut);

        // 7. ĐH Kinh tế TP.HCM
        School ueh = new School("7", "Đại học Kinh tế TP.HCM", "UEH", "Nam", "Công lập");
        ueh.setAddress("59C Nguyễn Đình Chiểu, Quận 3, TP.HCM");
        ueh.setPhone("028 3829 3082");
        ueh.setEmail("info@ueh.edu.vn");
        ueh.setWebsite("https://www.ueh.edu.vn");
        ueh.setDescription("UEH là trường đại học kinh tế hàng đầu Việt Nam, đào tạo nhiều thế hệ doanh nhân và chuyên gia kinh tế.");
        ueh.setImages(Arrays.asList("https://example.com/ueh1.jpg"));
        ueh.setMajors(Arrays.asList(
            "Kinh tế", "Quản trị kinh doanh", "Marketing",
            "Kế toán", "Tài chính ngân hàng", "Thương mại quốc tế"
        ));
        ueh.setTuitionRange("10 - 20 triệu/năm");
        ueh.setFacilities(Arrays.asList(
            "Thư viện kinh tế lớn nhất VN",
            "Phòng Trading mô phỏng",
            "Trung tâm khởi nghiệp"
        ));
        ueh.setClubs(Arrays.asList("CLB Khởi nghiệp", "CLB Đầu tư", "CLB Marketing"));
        ueh.setAdmissionPolicy("Tuyển sinh theo điểm thi THPT, ưu tiên khối D, A1.");
        Map<String, Double> uehScores = new HashMap<>();
        uehScores.put("Kinh tế", 26.0);
        uehScores.put("Quản trị kinh doanh", 25.5);
        ueh.setBenchmarkScores(uehScores);
        ueh.setAdmissionQuota("5,000 chỉ tiêu");
        ueh.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Thi đánh giá năng lực"));
        schools.add(ueh);

        // 8. ĐH RMIT
        School rmit = new School("8", "Đại học RMIT Việt Nam", "RMIT", "Nam", "Quốc tế");
        rmit.setAddress("702 Nguyễn Văn Linh, Quận 7, TP.HCM");
        rmit.setPhone("028 3776 1300");
        rmit.setEmail("study@rmit.edu.vn");
        rmit.setWebsite("https://www.rmit.edu.vn");
        rmit.setDescription("RMIT là trường đại học quốc tế hàng đầu tại Việt Nam, chương trình đào tạo theo chuẩn Úc.");
        rmit.setImages(Arrays.asList("https://example.com/rmit1.jpg", "https://example.com/rmit2.jpg"));
        rmit.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Thiết kế đồ họa", "Kiến trúc",
            "Quản trị kinh doanh", "Marketing", "Truyền thông đa phương tiện"
        ));
        rmit.setTuitionRange("300 - 500 triệu/năm");
        rmit.setFacilities(Arrays.asList(
            "Campus chuẩn quốc tế",
            "Phòng lab Apple, Adobe",
            "Studio thiết kế chuyên nghiệp",
            "Thư viện điện tử toàn cầu"
        ));
        rmit.setClubs(Arrays.asList("CLB Design", "CLB Business", "CLB Yoga", "CLB Esports"));
        rmit.setAdmissionPolicy("Tuyển sinh linh hoạt, yêu cầu tiếng Anh IELTS 5.5+, không yêu cầu điểm thi THPT.");
        Map<String, Double> rmitScores = new HashMap<>();
        rmitScores.put("Thiết kế đồ họa", 0.0); // Không theo điểm chuẩn
        rmit.setBenchmarkScores(rmitScores);
        rmit.setAdmissionQuota("1,500 chỉ tiêu");
        rmit.setAdmissionMethods(Arrays.asList("Xét học bạ + IELTS", "Phỏng vấn trực tiếp", "Portfolio (ngành thiết kế)"));
        schools.add(rmit);

        // 9. ĐH Y Dược TP.HCM
        School yduoc = new School("9", "Đại học Y Dược TP.HCM", "ĐH Y Dược", "Nam", "Công lập");
        yduoc.setAddress("217 Hồng Bàng, Quận 5, TP.HCM");
        yduoc.setPhone("028 3855 4269");
        yduoc.setEmail("dhydtp@yds.edu.vn");
        yduoc.setWebsite("https://www.yds.edu.vn");
        yduoc.setDescription("Trường Đại học Y Dược TP.HCM là cơ sở đào tạo y dược hàng đầu miền Nam.");
        yduoc.setImages(Arrays.asList("https://example.com/yduoc1.jpg"));
        yduoc.setMajors(Arrays.asList(
            "Y khoa", "Răng Hàm Mặt", "Dược học",
            "Điều dưỡng", "Y tế công cộng"
        ));
        yduoc.setTuitionRange("15 - 25 triệu/năm");
        yduoc.setFacilities(Arrays.asList(
            "Bệnh viện trường ĐH Y Dược",
            "Phòng giải phẫu thực hành",
            "Phòng thí nghiệm Sinh học phân tử"
        ));
        yduoc.setClubs(Arrays.asList("CLB Y tế tình nguyện", "CLB Cấp cứu", "CLB Bóng chuyền"));
        yduoc.setAdmissionPolicy("Tuyển sinh khắt khe, yêu cầu điểm cao môn Hóa, Sinh, Anh.");
        Map<String, Double> yduocScores = new HashMap<>();
        yduocScores.put("Y khoa", 28.5);
        yduocScores.put("Dược học", 27.0);
        yduoc.setBenchmarkScores(yduocScores);
        yduoc.setAdmissionQuota("2,000 chỉ tiêu");
        yduoc.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Tuyển thẳng học sinh giỏi"));
        schools.add(yduoc);

        // 10. ĐH Tôn Đức Thắng
        School tdtu = new School("10", "Đại học Tôn Đức Thắng", "TDTU", "Nam", "Công lập");
        tdtu.setAddress("19 Nguyễn Hữu Thọ, Quận 7, TP.HCM");
        tdtu.setPhone("028 3775 5055");
        tdtu.setEmail("tuyensinh@tdtu.edu.vn");
        tdtu.setWebsite("https://www.tdtu.edu.vn");
        tdtu.setDescription("Đại học Tôn Đức Thắng là trường công lập năng động, có campus đẹp bên sông Sài Gòn.");
        tdtu.setImages(Arrays.asList("https://example.com/tdtu1.jpg"));
        tdtu.setMajors(Arrays.asList(
            "Công nghệ thông tin", "Kỹ thuật phần mềm", "Quản trị kinh doanh",
            "Kế toán", "Marketing", "Luật"
        ));
        tdtu.setTuitionRange("12 - 18 triệu/năm");
        tdtu.setFacilities(Arrays.asList(
            "Campus view sông hiện đại",
            "Thư viện 8 tầng",
            "Khu thể thao đa năng",
            "Canteen 5 sao"
        ));
        tdtu.setClubs(Arrays.asList("CLB Startup", "CLB Nhiếp ảnh", "CLB Võ thuật"));
        tdtu.setAdmissionPolicy("Tuyển sinh đa dạng, điểm chuẩn vừa phải, môi trường năng động.");
        Map<String, Double> tdtuScores = new HashMap<>();
        tdtuScores.put("Công nghệ thông tin", 23.0);
        tdtuScores.put("Kế toán", 22.5);
        tdtu.setBenchmarkScores(tdtuScores);
        tdtu.setAdmissionQuota("7,000 chỉ tiêu");
        tdtu.setAdmissionMethods(Arrays.asList("Xét điểm thi THPT", "Xét học bạ", "Thi riêng"));
        schools.add(tdtu);

        return schools;
    }

    public static List<String> getRegions() {
        return Arrays.asList("Tất cả", "Bắc", "Trung", "Nam");
    }

    public static List<String> getTypes() {
        return Arrays.asList("Tất cả", "Công lập", "Dân lập", "Quốc tế");
    }
}


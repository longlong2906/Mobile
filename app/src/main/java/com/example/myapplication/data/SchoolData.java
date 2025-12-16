package com.example.myapplication.data;

import com.example.myapplication.R;
import com.example.myapplication.models.School;
import com.example.myapplication.models.SchoolMajor;
import com.example.myapplication.models.Specialization;
import com.example.myapplication.models.Subject;

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
                bkhn.setImageUrl(
                                "https://cdn-media.sforum.vn/storage/app/media/giakhanh/h%E1%BB%8Dc%20ph%C3%AD%20%C4%91%E1%BA%A1i%20h%E1%BB%8Dc%20b%C3%A1ch%20khoa%20h%C3%A0%20n%E1%BB%99i/hoc-phi-dai-hoc-bach-khoa-ha-noi-thumbnail.jpg");
                bkhn.setAddress("Số 1 Đại Cồ Việt, Hai Bà Trưng, Hà Nội");
                bkhn.setWebsite("https://www.hust.edu.vn");
                bkhn.setDescription(
                                "Trường Đại học Bách khoa Hà Nội là trường đại học kỹ thuật đầu tiên và lâu đời nhất ở Việt Nam, được thành lập năm 1956.");
                bkhn.setImages(Arrays.asList(
                                "https://hust.edu.vn/uploads/sys/truong-dai-hoc-bach-khoa-ha-noi-1-1697529452.jpg",
                                "https://hust.edu.vn/uploads/sys/tv-ta-quang-buu-1-1697529452.jpg"));
                bkhn.setMajors(Arrays.asList(
                                "Công nghệ thông tin (Global ICT)", "Kỹ thuật cơ khí", "Kỹ thuật điện tử",
                                "Kỹ thuật hóa học", "Khoa học máy tính", "Kỹ thuật điều khiển & Tự động hóa"));
                bkhn.setTuitionRange("25 - 40 triệu/năm (Chương trình chuẩn)");
                bkhn.setFacilities(Arrays.asList(
                                "Thư viện Tạ Quang Bửu hiện đại nhất ĐNA",
                                "Hệ thống phòng thí nghiệm trọng điểm quốc gia",
                                "Sân vận động Bách Khoa",
                                "Ký túc xá tiện nghi"));
                bkhn.setClubs(Arrays.asList("CLB Nghiên cứu khoa học", "CLB Hỗ trợ học tập", "CLB Âm nhạc (BK Music)",
                                "CLB Tình nguyện"));
                bkhn.setAdmissionPolicy(
                                "Tuyển sinh dựa trên kết quả thi THPT Quốc gia, thi Đánh giá tư duy, tuyển thẳng tài năng.");
                Map<String, Double> bkhnScores = new HashMap<>();
                bkhnScores.put("Công nghệ thông tin (Global ICT)", 28.2);
                bkhnScores.put("Khoa học máy tính", 29.0);
                bkhnScores.put("Kỹ thuật điều khiển & Tự động hóa", 27.5);
                bkhn.setBenchmarkScores(bkhnScores);
                bkhn.setAdmissionQuota("7,500 chỉ tiêu");
                bkhn.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét tuyển tài năng", "Thi Đánh giá tư duy"));
                schools.add(bkhn);

                // 2. ĐH Công nghệ - ĐHQGHN (UET) - Thay thế cho ĐH Quốc gia chung chung
                School uet = new School("2", "Đại học Công nghệ - ĐHQGHN", "UET", "Bắc", "Công lập");
                uet.setImageUrl("https://uet.vnu.edu.vn/wp-content/uploads/2017/02/DJI_0041-1024x641.jpg");
                uet.setAddress("144 Xuân Thủy, Cầu Giấy, Hà Nội");
                uet.setWebsite("https://uet.vnu.edu.vn");
                uet.setDescription(
                                "Trường Đại học Công nghệ là thành viên của ĐHQGHN, đào tạo nguồn nhân lực chất lượng cao về công nghệ kỹ thuật.");
                uet.setImages(Arrays.asList("https://uet.vnu.edu.vn/wp-content/uploads/2019/01/IMG_0001.jpg"));
                uet.setMajors(Arrays.asList(
                                "Công nghệ thông tin", "Kỹ thuật máy tính", "Công nghệ kỹ thuật điện tử - viễn thông",
                                "Cơ kỹ thuật", "Công nghệ hàng không vũ trụ", "Trí tuệ nhân tạo"));
                uet.setTuitionRange("25 - 35 triệu/năm");
                uet.setFacilities(Arrays.asList(
                                "Phòng thực hành máy tính cấu hình cao",
                                "Xưởng thực hành cơ khí - tự động hóa",
                                "Thư viện ĐHQGHN"));
                uet.setClubs(Arrays.asList("CLB UET Code", "CLB Robotics", "CLB Nhân sự (HR-Tech)"));
                uet.setAdmissionPolicy(
                                "Tuyển sinh theo quy chế của ĐHQGHN, ưu tiên thí sinh có chứng chỉ quốc tế SAT, A-Level.");
                Map<String, Double> uetScores = new HashMap<>();
                uetScores.put("Công nghệ thông tin", 27.85);
                uetScores.put("Trí tuệ nhân tạo", 27.0);
                uet.setBenchmarkScores(uetScores);
                uet.setAdmissionQuota("1,800 chỉ tiêu");
                uet.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực ĐHQGHN", "Chứng chỉ quốc tế"));
                schools.add(uet);

                // 3. ĐH FPT
                School fpt = new School("3", "Đại học FPT", "ĐH FPT", "Bắc", "Dân lập");
                fpt.setImageUrl(
                                "https://hcmuni.fpt.edu.vn/Data/Sites/1/media/202020-kimvi/img/campus/thiet-ke-truong-dh-fpt-hcm-quan-9-1.jpg");
                fpt.setAddress("Khu CNC Hòa Lạc, Hà Nội (và TP.HCM, Đà Nẵng, Cần Thơ, Quy Nhơn)");
                fpt.setWebsite("https://university.fpt.edu.vn");
                fpt.setDescription(
                                "Trường đại học tiên phong đào tạo theo hình thức liên kết chặt chẽ với doanh nghiệp, chú trọng ngoại ngữ và kỹ năng mềm.");
                fpt.setImages(
                                Arrays.asList("https://daihoc.fpt.edu.vn/wp-content/uploads/2020/07/toan-canh-dai-hoc-fpt-ha-noi.jpg"));
                fpt.setMajors(Arrays.asList(
                                "Kỹ thuật phần mềm", "An toàn thông tin", "Thiết kế đồ họa",
                                "Quản trị kinh doanh", "Kinh doanh quốc tế", "Truyền thông đa phương tiện"));
                fpt.setTuitionRange("50 - 80 triệu/năm");
                fpt.setFacilities(Arrays.asList(
                                "Campus đẹp, hiện đại, xanh",
                                "Ký túc xá đầy đủ tiện nghi",
                                "Sân trượt băng, phòng Gym, nhạc cụ dân tộc"));
                fpt.setClubs(Arrays.asList("FPT Guitar Club", "JS Club (Japanese Software)", "No Shy Club (English)"));
                fpt.setAdmissionPolicy(
                                "Xét tuyển linh hoạt, ưu tiên năng lực tư duy (thi trắc nghiệm IQ/EQ) và tiếng Anh.");
                Map<String, Double> fptScores = new HashMap<>();
                fptScores.put("Kỹ thuật phần mềm", 21.0); // Điểm học bạ tham khảo
                fpt.setBenchmarkScores(fptScores);
                fpt.setAdmissionQuota("10,000+ chỉ tiêu toàn quốc");
                fpt.setAdmissionMethods(Arrays.asList("Xét học bạ", "Thi sơ tuyển FPT", "Điểm thi THPT"));
                schools.add(fpt);

                // 4. Học viện Công nghệ Bưu chính Viễn thông (PTIT)
                School ptit = new School("11", "Học viện Công nghệ Bưu chính Viễn thông", "PTIT", "Bắc", "Công lập");
                ptit.setImageUrl(
                                "https://daotao.ptit.edu.vn/wp-content/uploads/sites/3/2024/08/Slide-16_9-2-1-1024x641.png");
                ptit.setAddress("Km10 Đường Nguyễn Trãi, Hà Đông, Hà Nội");
                ptit.setWebsite("https://www.ptit.edu.vn");
                ptit.setDescription("Cơ sở đào tạo trực thuộc Bộ KH&CN, đào tạo kỹ sư chất lượng cao.");
                ptit.setImages(Arrays.asList("https://portal.ptit.edu.vn/wp-content/uploads/2016/04/PTIT-Campus.jpg"));
                ptit.setMajors(Arrays.asList(
                                "Công nghệ thông tin", "An toàn thông tin", "Điện tử viễn thông",
                                "Kỹ thuật điều khiển", "Công nghệ đa phương tiện", "Marketing",
                                "Khoa học máy tính", "Trí tuệ nhân tạo", "Báo chí",
                                "Quản trị kinh doanh", "Công nghệ tài chính", "Kế toán",
                                "Công nghệ Internet vạn vật (AIoT)"));
                ptit.setTuitionRange("18 - 22 triệu/năm");
                ptit.setFacilities(Arrays.asList("Hạ tầng mạng mạnh", "Lab Samsung, Lab Huawei", "Smart Classroom"));
                ptit.setClubs(Arrays.asList("CLB Lập trình PTIT", "CLB An toàn thông tin (ISP)", "CLB IT PTIT"));
                ptit.setAdmissionPolicy("Tuyển sinh khối A00, A01, D01. Điểm chuẩn thuộc top đầu các trường kỹ thuật.");
                Map<String, Double> ptitScores = new HashMap<>();
                ptitScores.put("Công nghệ thông tin", 26.59);
                ptitScores.put("An toàn thông tin", 26.04);
                ptitScores.put("Điện tử viễn thông", 25.68);
                ptitScores.put("Khoa học máy tính", 26.5); // Ước lượng dựa trên CNTT
                ptitScores.put("Trí tuệ nhân tạo", 26.3); // Mới
                ptitScores.put("Công nghệ Internet vạn vật (AIoT)", 25.5);
                ptitScores.put("Báo chí", 24.5);
                ptitScores.put("Truyền thông đa phương tiện", 25.8);
                ptitScores.put("Quản trị kinh doanh", 25.2);
                ptitScores.put("Công nghệ tài chính", 25.6);
                ptitScores.put("Kế toán", 24.8);
                ptit.setBenchmarkScores(ptitScores);
                ptit.setAdmissionQuota("3,800 chỉ tiêu");
                ptit.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Tuyển thẳng", "Xét kết hợp"));
                schools.add(ptit);

                // ========== KHU VỰC TRUNG ==========

                // 5. ĐH Đà Nẵng (Đại diện Bách Khoa Đà Nẵng)
                School ud = new School("5", "Trường Đại học Bách Khoa - ĐH Đà Nẵng", "DUT", "Trung", "Công lập");
                ud.setImageUrl("https://dut.udn.vn/images/slider/slide1.jpg");
                ud.setAddress("54 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng");
                ud.setWebsite("https://dut.udn.vn");
                ud.setDescription("Trường kỹ thuật đầu ngành khu vực miền Trung - Tây Nguyên.");
                ud.setMajors(Arrays.asList("Công nghệ thông tin", "Kỹ thuật điện", "Kỹ thuật xây dựng", "Kiến trúc",
                                "Công nghệ dầu khí"));
                ud.setTuitionRange("15 - 25 triệu/năm");
                ud.setFacilities(Arrays.asList("Khu thí nghiệm công nghệ cao", "Phòng Maker Space", "Thư viện số"));
                ud.setClubs(Arrays.asList("BKĐN Tech Club", "CLB Tiếng Anh"));
                Map<String, Double> udScores = new HashMap<>();
                udScores.put("Công nghệ thông tin", 26.5);
                udScores.put("Kỹ thuật xây dựng", 22.0);
                ud.setBenchmarkScores(udScores);
                ud.setAdmissionQuota("3,500 chỉ tiêu");
                ud.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét học bạ"));
                schools.add(ud);

                // 6. ĐH Y Dược Huế
                School hue = new School("6", "Trường Đại học Y Dược - ĐH Huế", "HueUMP", "Trung", "Công lập");
                hue.setImageUrl("https://news.huemed-univ.edu.vn/uploads/images/2022/05/26/banner_web_2.jpg");
                hue.setAddress("06 Ngô Quyền, Vĩnh Ninh, Huế");
                hue.setWebsite("https://huemed-univ.edu.vn");
                hue.setDescription("Trường đào tạo y khoa uy tín lâu đời tại miền Trung.");
                hue.setMajors(Arrays.asList("Y khoa", "Răng Hàm Mặt", "Dược học", "Điều dưỡng", "Y học cổ truyền"));
                hue.setTuitionRange("20 - 40 triệu/năm");
                Map<String, Double> hueScores = new HashMap<>();
                hueScores.put("Y khoa", 26.0);
                hueScores.put("Dược học", 25.0);
                hue.setBenchmarkScores(hueScores);
                hue.setAdmissionQuota("1,500 chỉ tiêu");
                hue.setAdmissionMethods(Arrays.asList("Xét thi THPT"));
                schools.add(hue);

                // ========== KHU VỰC NAM ==========

                // 7. ĐH Bách Khoa TP.HCM
                School hcmut = new School("7", "Đại học Bách Khoa TP.HCM", "HCMUT", "Nam", "Công lập");
                hcmut.setImageUrl("https://hcmut.edu.vn/img/nhanDienThuongHieu/Banner_HCMUT.png");
                hcmut.setAddress("268 Lý Thường Kiệt, Q.10, TP.HCM");
                hcmut.setWebsite("https://hcmut.edu.vn");
                hcmut.setDescription("Trường đại học kỹ thuật trọng điểm phía Nam, thành viên ĐHQG TP.HCM.");
                hcmut.setMajors(Arrays.asList("Khoa học máy tính", "Kỹ thuật máy tính", "Kỹ thuật Ô tô", "Logistics",
                                "Kỹ thuật Hóa học"));
                hcmut.setTuitionRange("30 - 60 triệu/năm");
                hcmut.setFacilities(
                                Arrays.asList("Phòng thí nghiệm quốc gia", "Ký túc xá Bách Khoa",
                                                "Hệ thống máy tính hiệu năng cao"));
                Map<String, Double> hcmutScores = new HashMap<>();
                hcmutScores.put("Khoa học máy tính", 28.0);
                hcmutScores.put("Logistics", 27.5);
                hcmut.setBenchmarkScores(hcmutScores);
                hcmut.setAdmissionQuota("5,000 chỉ tiêu");
                hcmut.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực ĐHQG", "Ưu tiên xét tuyển"));
                schools.add(hcmut);

                // 8. ĐH Kinh tế TP.HCM
                School ueh = new School("8", "Đại học Kinh tế TP.HCM", "UEH", "Nam", "Công lập");
                ueh.setImageUrl("https://ueh.edu.vn/images/logo/logo-ueh-1.jpg");
                ueh.setAddress("59C Nguyễn Đình Chiểu, Q.3, TP.HCM (và nhiều cơ sở khác)");
                ueh.setWebsite("https://ueh.edu.vn");
                ueh.setDescription("Trường đại học đa ngành, trọng điểm về kinh tế, quản lý và luật.");
                ueh.setMajors(Arrays.asList("Kinh doanh quốc tế", "Marketing", "Tài chính - Ngân hàng", "Kế toán",
                                "Công nghệ Marketing"));
                ueh.setTuitionRange("25 - 45 triệu/năm");
                Map<String, Double> uehScores = new HashMap<>();
                uehScores.put("Kinh doanh quốc tế", 27.0);
                uehScores.put("Marketing", 27.2);
                ueh.setBenchmarkScores(uehScores);
                ueh.setAdmissionQuota("7,000 chỉ tiêu");
                ueh.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực", "Xét học bạ"));
                schools.add(ueh);

                // 9. ĐH RMIT Nam
                School rmit = new School("9", "Đại học RMIT Việt Nam (Nam Sài Gòn)", "RMIT", "Nam", "Quốc tế");
                rmit.setImageUrl("https://www.rmit.edu.vn/sites/default/files/2021-11/RMIT-Campus-Hero.jpg");
                rmit.setAddress("702 Nguyễn Văn Linh, Q.7, TP.HCM");
                rmit.setWebsite("https://rmit.edu.vn");
                rmit.setDescription("Chương trình giáo dục chuẩn Úc, môi trường học tập quốc tế năng động.");
                rmit.setMajors(Arrays.asList("Digital Marketing", "Kinh doanh", "Công nghệ thông tin",
                                "Thiết kế ứng dụng",
                                "Thời trang"));
                rmit.setTuitionRange("300 triệu+/năm");
                rmit.setFacilities(
                                Arrays.asList("Thư viện hiện đại", "Khu phức hợp thể thao", "Phòng thực hành Mac Lab"));
                rmit.setBenchmarkScores(new HashMap<>()); // Không xét điểm chuẩn
                rmit.setAdmissionQuota("Theo hồ sơ");
                rmit.setAdmissionMethods(Arrays.asList("Xét hồ sơ THPT", "Yêu cầu tiếng Anh (IELTS 6.5+)"));
                schools.add(rmit);

                // 10. ĐH Y Dược TP.HCM
                School yds = new School("10", "Đại học Y Dược TP.HCM", "UMP", "Nam", "Công lập");
                yds.setImageUrl("https://yds.edu.vn/uploads/images/banner-yds.jpg");
                yds.setAddress("217 Hồng Bàng, Q.5, TP.HCM");
                yds.setWebsite("https://yds.edu.vn");
                yds.setDescription("Trung tâm đào tạo nhân lực y tế, nghiên cứu khoa học lớn nhất phía Nam.");
                yds.setMajors(Arrays.asList("Y khoa", "Răng Hàm Mặt", "Dược học", "Kỹ thuật hình ảnh y học"));
                yds.setTuitionRange("40 - 70 triệu/năm");
                Map<String, Double> ydsScores = new HashMap<>();
                ydsScores.put("Y khoa", 28.5);
                ydsScores.put("Răng Hàm Mặt", 28.0);
                yds.setBenchmarkScores(ydsScores);
                yds.setAdmissionQuota("2,300 chỉ tiêu");
                yds.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét tuyển thẳng"));
                schools.add(yds);

                // 12. ĐH Tôn Đức Thắng
                School tdtu = new School("12", "Đại học Tôn Đức Thắng", "TDTU", "Nam", "Công lập");
                tdtu.setImageUrl("https://www.tdtu.edu.vn/sites/www/files/styles/large/public/banner_01.jpg");
                tdtu.setAddress("19 Nguyễn Hữu Thọ, Q.7, TP.HCM");
                tdtu.setWebsite("https://tdtu.edu.vn");
                tdtu.setDescription("Trường đại học công lập tự chủ toàn diện, cơ sở vật chất 5 sao.");
                tdtu.setMajors(Arrays.asList("Kỹ thuật phần mềm", "Kế toán", "Luật học", "Quản trị kinh doanh",
                                "Du lịch"));
                tdtu.setTuitionRange("25 - 50 triệu/năm");
                tdtu.setFacilities(Arrays.asList("Nhà thi đấu đa năng", "Thư viện truyền cảm hứng",
                                "Sân vận động FIFA 2 sao"));
                Map<String, Double> tdtuScores = new HashMap<>();
                tdtuScores.put("Kỹ thuật phần mềm", 34.0); // Thang 40
                tdtu.setBenchmarkScores(tdtuScores);
                tdtu.setAdmissionQuota("6,500 chỉ tiêu");
                tdtu.setAdmissionMethods(Arrays.asList("Xét học bạ", "Xét thi THPT", "Ưu tiên xét tuyển"));
                schools.add(tdtu);

                return schools;
        }

        public static List<String> getRegions() {
                return Arrays.asList("Tất cả", "Bắc", "Trung", "Nam");
        }

        public static List<String> getTypes() {
                return Arrays.asList("Tất cả", "Công lập", "Dân lập", "Quốc tế");
        }

        public static List<SchoolMajor> getMajorsForSchool(String schoolId) {
                List<SchoolMajor> majors = new ArrayList<>();

                switch (schoolId) {
                        case "1": // BKHN
                                majors.add(createDetailedMajor("1_1", "1", "Công nghệ thông tin (Global ICT)", "IT-E7",
                                                "Chương trình đào tạo Công nghệ thông tin chuẩn quốc tế, giảng dạy bằng tiếng Anh.",
                                                155,
                                                "100 chỉ tiêu", "2023: 28.2\n2022: 28.0", "A00, A01",
                                                "Học hoàn toàn bằng tiếng Anh. Giáo trình cập nhật từ các ĐH danh tiếng thế giới.",
                                                "Các tập đoàn công nghệ lớn, công ty đa quốc gia", "Viện CNTT&TT",
                                                "VinGroup, FPT, Viettel",
                                                "Bộ phận R&D",
                                                "40 - 50 triệu/năm", 28.2, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(
                                                                Arrays.asList("Khoa học máy tính", "Kỹ thuật dữ liệu"),
                                                                getITSubjects()));

                                majors.add(createDetailedMajor("1_2", "1", "Kỹ thuật Cơ khí", "ME1",
                                                "Đào tạo kỹ sư cơ khí có khả năng thiết kế, chế tạo, vận hành và bảo trì các hệ thống thiết bị cơ khí.",
                                                160,
                                                "400 chỉ tiêu", "2023: 26.5\n2022: 26.0", "A00, A01",
                                                "Cơ sở thiết kế máy, Chế tạo máy, Thủy lực khí nén, CAD/CAM...",
                                                "Nhà máy sản xuất ô tô, xe máy, thiết bị công nghiệp", "Viện Cơ khí",
                                                "VinFast, Toyota, Honda",
                                                "Xưởng sản xuất",
                                                "25 - 30 triệu/năm", 26.5, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Chế tạo máy", "Cơ điện tử"),
                                                                getMechanicalSubjects()));
                                break;

                        case "2": // UET - Đại học Công nghệ
                                majors.add(createDetailedMajor("2_1", "2", "Công nghệ thông tin", "CN1",
                                                "Ngành CNTT của UET tập trung vào nền tảng khoa học cơ bản và công nghệ hiện đại.",
                                                135,
                                                "300 chỉ tiêu", "2023: 27.85\n2022: 29.15", "A00, A01",
                                                "Cấu trúc dữ liệu, Giải thuật, Hệ điều hành, Mạng máy tính, AI, Machine Learning.",
                                                "Công ty phần mềm, Viện nghiên cứu", "Khoa CNTT",
                                                "Samsung, FPT, Viettel", "Team Dev",
                                                "35 triệu/năm", 27.85, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(createSpecializations(
                                                Arrays.asList("Công nghệ phần mềm", "Hệ thống thông tin"),
                                                getITSubjects()));

                                majors.add(createDetailedMajor("2_2", "2", "Trí tuệ nhân tạo", "CN8", // Giả định mã
                                                "Đào tạo chuyên sâu về AI, học máy, xử lý ngôn ngữ tự nhiên.", 135,
                                                "100 chỉ tiêu", "2023: 27.0\n2022: 27.5", "A00, A01",
                                                "Toán cho AI, Deep Learning, Computer Vision, NLP, Big Data.",
                                                "Công ty công nghệ cao, Lab AI", "Bộ môn KHMT", "VinAI, FPT.AI",
                                                "AI Engineer",
                                                "35 triệu/năm", 27.0, 4, "Cử nhân/Kỹ sư"));
                                break;

                        case "3": // FPT
                                majors.add(createDetailedMajor("3_1", "3", "Kỹ thuật phần mềm", "SE",
                                                "Đào tạo Kỹ sư phần mềm theo chuẩn ACM, chú trọng thực hành và tiếng Anh/Nhật.",
                                                140,
                                                "Không giới hạn", "Xét học bạ Top 40", "A00, A01, D01",
                                                "Java, .NET, JS, Nodejs, Mobile Dev, Cloud, DevOps. Học kỳ OJT (On-the-job Training) tại doanh nghiệp.",
                                                "FPT Software, doanh nghiệp Outsourcing", "Khoa CNTT",
                                                "FPT, Google, Microsoft",
                                                "Software Engineer",
                                                "70 triệu/năm", 21.0, 4, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("SE - Java", "SE - .NET"),
                                                                getITSubjects()));
                                break;

                        case "11": // PTIT - Giữ nguyên logic cũ nhưng refactor gọn hơn nếu cần, ở đây giữ nguyên
                                   // vì data tốt
                                addPTITMajors(majors, "11");
                                break;

                        case "5": // DUT Đà Nẵng
                                majors.add(createDetailedMajor("5_1", "5", "Công nghệ thông tin", "7480201",
                                                "Ngành CNTT chất lượng cao, mũi nhọn của ĐH Bách Khoa Đà Nẵng.", 150,
                                                "250 chỉ tiêu", "2023: 26.5\n2022: 26.0", "A00, A01",
                                                "Lập trình, Mạng, CSDL, An toàn thông tin.",
                                                "Khu công nghệ cao Đà Nẵng", "Khoa CNTT", "FPT Đà Nẵng, LG, Enclave",
                                                "Dev Team",
                                                "25 triệu/năm", 26.5, 4, "Kỹ sư"));
                                majors.get(majors.size() - 1)
                                                .setSpecializations(createSpecializations(
                                                                Arrays.asList("CNPM", "Mạng MT"), getITSubjects()));
                                break;

                        case "6": // ĐH Y Dược Huế
                                addMedicalMajors(majors, "6");
                                break;

                        case "7": // HCMUT
                                majors.add(createDetailedMajor("7_1", "7", "Khoa học máy tính", "CS",
                                                "Ngành hot nhất Bách Khoa HCM, tập trung vào thuật toán và nền tảng máy tính.",
                                                145,
                                                "200 chỉ tiêu", "2023: 28.0\n2022: 28.0", "A00, A01",
                                                "Advanced Algorithms, AI, Database Systems, Software Engineering.",
                                                "Tech Giants", "Khoa KHMT", "VNG, Shopee, Grab", "Core Team",
                                                "60 triệu/năm", 28.0, 4, "Kỹ sư"));
                                majors.get(majors.size() - 1)
                                                .setSpecializations(createSpecializations(
                                                                Arrays.asList("AI", "Security"), getITSubjects()));
                                break;

                        case "8": // UEH
                                majors.add(createDetailedMajor("8_1", "8", "Kinh doanh quốc tế", "IB",
                                                "Đào tạo nhân sự cho các hoạt động thương mại toàn cầu.", 125,
                                                "300 chỉ tiêu", "2023: 27.0", "A00, A01, D01",
                                                "Logistics, Thanh toán quốc tế, Luật thương mại QT, Marketing QT.",
                                                "Công ty XNK, Logistics", "Khoa KDQT", "Maersk, DHL", "Sales/Doc",
                                                "40 triệu/năm", 27.0, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Ngoại thương", "Logistics"),
                                                                getEconomicsSubjects()));
                                break;

                        case "10": // UMP Y Dược HCM
                                addMedicalMajors(majors, "10");
                                break;

                        case "12": // TDTU
                                majors.add(createDetailedMajor("12_1", "12", "Kỹ thuật phần mềm", "7480103",
                                                "Tập trung đào tạo kỹ năng làm việc thực tế, kỷ luật và ngoại ngữ.",
                                                140,
                                                "300 chỉ tiêu", "2023: 34.0 (thang 40)", "A00, A01, D01",
                                                "Software Testing, Project Management, Mobile App, Web App.",
                                                "Công ty phần mềm", "Khoa CNTT", "LogiGear, TMA", "Tester/Dev",
                                                "35 triệu/năm", 34.0, 4, "Kỹ sư"));
                                majors.get(majors.size() - 1)
                                                .setSpecializations(createSpecializations(Arrays.asList("CNPM", "HTTT"),
                                                                getITSubjects()));
                                break;

                        default:
                                // Nếu không có data chi tiết thì tạo cơ bản
                                return getBasicMajorsForSchool(schoolId);
                }

                return majors;
        }

        // --- HELPER METHODS FOR COMMON CURRICULUM GENERATION ---

        private static void addMedicalMajors(List<SchoolMajor> majors, String schoolId) {
                SchoolMajor ykhoa = createDetailedMajor(schoolId + "_1", schoolId, "Y khoa", "7720101",
                                "Đào tạo Bác sĩ đa khoa có y đức, kiến thức và kỹ năng nghề nghiệp để hành nghề khám chữa bệnh.",
                                200,
                                "400 chỉ tiêu", "Luôn ở mức rất cao (>28 điểm)", "B00 (Toán, Hóa, Sinh)",
                                "Giải phẫu, Sinh lý, Hóa sinh, Mô phôi, Dược lý, Nội, Ngoại, Sản, Nhi, Truyền nhiễm, Y học cộng đồng.",
                                "Bệnh viện các tuyến, Viện nghiên cứu y học", "Khoa Y", "BV Chợ Rẫy, BV Bạch Mai",
                                "Bác sĩ điều trị",
                                "50 triệu/năm", 28.5, 6, "Bác sĩ");
                ykhoa.setSpecializations(
                                createSpecializations(Arrays.asList("Nội khoa", "Ngoại khoa"), getMedicalSubjects()));
                majors.add(ykhoa);

                SchoolMajor duoc = createDetailedMajor(schoolId + "_2", schoolId, "Dược học", "7720201",
                                "Đào tạo Dược sĩ đại học.", 160,
                                "300 chỉ tiêu", "Cao (>26 điểm)", "A00, B00",
                                "Hóa dược, Dược liệu, Bào chế, Dược lâm sàng, Quản lý dược.",
                                "Công ty Dược, Nhà thuốc, Khoa Dược Bệnh viện", "Khoa Dược", "DHG, Traphaco", "Dược sĩ",
                                "50 triệu/năm", 27.0, 5, "Dược sĩ");
                // Tái sử dụng danh sách môn y nhưng thêm môn dược (giản lược cho demo)
                duoc.setSpecializations(
                                createSpecializations(Arrays.asList("Dược lâm sàng", "SX thuốc"),
                                                getMedicalSubjects()));
                majors.add(duoc);
        }

        private static void addPTITMajors(List<SchoolMajor> majors, String schoolId) {
                // 1. CNTT
                SchoolMajor it = createDetailedMajor(schoolId + "_1", schoolId, "Công nghệ thông tin", "7480201",
                                "Ngành Công nghệ thông tin (gồm có 3 chuyên ngành Mạng máy tính và truyền thông dữ liệu, Công nghệ phần mềm, Hệ thống thông tin, không xét tuyển theo chuyên ngành, khi vào học sinh viên tự chọn chuyên ngành)",
                                150,
                                "Năm 2024: 600\nNăm 2023: 730\nNăm 2022: 840\nNăm 2021: 770",
                                "Năm 2024: 26.40\nNăm 2023: 26.59\nNăm 2022: 27.25\nNăm 2021: 26.90",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Chương trình đào tạo cập nhật theo định hướng 4.0, gồm các chuyên ngành sâu về Công nghệ phần mềm, Hệ thống thông tin và Mạng máy tính.",
                                "Các Cục, Vụ (CNTT, Viễn thông...); Các Sở TTTT",
                                "Viện CNTT, Viện CNPM, Viện Chiến lược TT&TT",
                                "VNPT, Viettel, VTC, FPT, CMC...",
                                "Các đơn vị chuyên trách về CNTT tại cơ quan nhà nước, ngân hàng, doanh nghiệp",
                                "655.000 đ/tín chỉ (2022), tăng tối đa 15%/năm", 26.40, 5, "Kỹ sư");
                it.setSpecializations(createSpecializations(Arrays.asList("Mạng máy tính và truyền thông dữ liệu",
                                "Công nghệ phần mềm", "Hệ thống thông tin"), getPTITITSubjects()));
                majors.add(it);

                // 2. ATTT
                SchoolMajor attt = createDetailedMajor(schoolId + "_2", schoolId, "An toàn thông tin", "7480202",
                                "Ngành An toàn thông tin trang bị kiến thức chuyên sâu về bảo mật mạng, an toàn hệ thống, mật mã học và kỹ năng phòng chống tấn công mạng.",
                                150,
                                "Năm 2024: 280\nNăm 2023: 260\nNăm 2022: 240\nNăm 2021: 220",
                                "Năm 2024: 25.85\nNăm 2023: 26.04\nNăm 2022: 26.70\nNăm 2021: 26.55",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Chương trình đào tạo trang bị kiến thức về tiền mã hóa, an toàn mạng, pentest, bảo mật ứng dụng web/mobile...",
                                "Các Cục, Vụ (CNTT, An toàn thông tin); Cơ quan nhà nước",
                                "Viện CNTT, Viện Nghiên cứu số",
                                "Viettel Cyber Security, BKAV, CMC Cyber Security, VNPT...",
                                "Chuyên gia bảo mật, Chuyên viên ATTT, Pentester",
                                "655.000 đ/tín chỉ (2022), tăng tối đa 15%/năm", 25.85, 4, "Kỹ sư");
                attt.setSpecializations(
                                createSpecializations(Arrays.asList("An toàn mạng", "An toàn hệ thống"),
                                                getPTITATTTSubjects()));
                majors.add(attt);

                // 3. ĐTVT
                SchoolMajor dtvt = createDetailedMajor(schoolId + "_3", schoolId, "Kỹ thuật Điện tử viễn thông",
                                "7520207",
                                "Đào tạo kỹ sư điện tử, viễn thông, IoT.", 150, "400 chỉ tiêu", "2023: 25.68",
                                "A00, A01",
                                "Mạch điện tử, Tín hiệu, Viễn thông, IoT.", "VNPT, Viettel", "Viện KHCN", "Samsung, LG",
                                "Kỹ sư",
                                "18-22 tr/năm", 25.68, 4, "Kỹ sư");
                dtvt.setSpecializations(
                                createSpecializations(Arrays.asList("Thông tin vô tuyến", "Hệ thống IoT"),
                                                getITSubjects()));
                majors.add(dtvt);

                // 4. Multimedia
                SchoolMajor multi = createDetailedMajor(schoolId + "_4", schoolId, "Công nghệ đa phương tiện",
                                "7480203",
                                "Kết hợp CNTT và Mỹ thuật đa phương tiện.", 140, "200 chỉ tiêu", "2023: 25.8",
                                "A00, A01, D01",
                                "Thiết kế đồ họa, Làm game, Quay dựng video, Xử lý âm thanh.", "Đài truyền hình",
                                "Công ty Game",
                                "VTV, VTC", "Designer", "18-22 tr/năm", 25.8, 4, "Cử nhân");
                multi.setSpecializations(
                                createSpecializations(Arrays.asList("Phát triển Game", "Thiết kế đa phương tiện"),
                                                getMultimediaSubjects()));
                majors.add(multi);

                // 5. Marketing
                SchoolMajor mkt = createDetailedMajor(schoolId + "_5", schoolId, "Marketing", "7340115",
                                "Marketing thời đại số (Digital Marketing).", 130, "150 chỉ tiêu", "2023: 25.0",
                                "A00, A01, D01",
                                "SEO, SEM, Content Marketing, Branding.", "Agency", "Doanh nghiệp", "Nhiều cty",
                                "Marketer",
                                "18-22 tr/năm", 25.0, 4, "Cử nhân");
                mkt.setSpecializations(
                                createSpecializations(Arrays.asList("Digital Marketing", "Truyền thông Marketing"),
                                                getEconomicsSubjects()));
                majors.add(mkt);

                // 6. Khoa học máy tính
                SchoolMajor cs = createDetailedMajor(schoolId + "_6", schoolId, "Khoa học máy tính", "7480101",
                                "Nghiên cứu sâu về thuật toán, AI, dữ liệu.", 150, "150 chỉ tiêu", "2023: 26.5",
                                "A00, A01",
                                "Algorithms, Machine Learning, Data Mining.", "Viện NC", "Big Tech", "Google, Facebook",
                                "Scientist",
                                "18-22 tr/năm", 26.5, 4, "Kỹ sư");
                cs.setSpecializations(createSpecializations(Arrays.asList("Dữ liệu lớn", "Học máy"), getITSubjects()));
                majors.add(cs);

                // 7. AI
                SchoolMajor ai = createDetailedMajor(schoolId + "_7", schoolId, "Trí tuệ nhân tạo", "7480108",
                                "Chuyên sâu về AI, Robot, Xử lý ngôn ngữ tự nhiên.", 150, "100 chỉ tiêu", "2023: 26.3",
                                "A00, A01",
                                "Deep Learning, NLP, Computer Vision, Robotics.", "VinAI", "FPT.AI", "Tech Groups",
                                "AI Engineer",
                                "18-22 tr/năm", 26.3, 4, "Kỹ sư");
                ai.setSpecializations(
                                createSpecializations(Arrays.asList("Xử lý ảnh", "Xử lý ngôn ngữ"), getITSubjects()));
                majors.add(ai);

                // 8. Báo chí
                SchoolMajor journalism = createDetailedMajor(schoolId + "_8", schoolId, "Báo chí", "7320101",
                                "Báo chí hiện đại, Báo chí dữ liệu, Báo chí đa phương tiện.", 130, "100 chỉ tiêu",
                                "2023: 24.5",
                                "C00, D01",
                                "Viết tin, Phỏng vấn, Biên tập, Sản xuất tin bài đa phương tiện.", "Tòa soạn",
                                "Đài PT-TH",
                                "VnExpress, VTV", "Nhà báo", "18-22 tr/năm", 24.5, 4, "Cử nhân");
                journalism.setSpecializations(
                                createSpecializations(Arrays.asList("Báo chí điện tử", "Báo chí dữ liệu"),
                                                getJournalismSubjects()));
                majors.add(journalism);

                // 9. QTKD
                SchoolMajor ba = createDetailedMajor(schoolId + "_9", schoolId, "Quản trị kinh doanh", "7340101",
                                "Quản trị doanh nghiệp, đặc biệt là doanh nghiệp công nghệ.", 130, "200 chỉ tiêu",
                                "2023: 25.2",
                                "A00, A01, D01",
                                "Quản trị chiến lược, HR, Marketing, Tài chính.", "Doanh nghiệp", "Startup", "Mọi cty",
                                "Manager",
                                "18-22 tr/năm", 25.2, 4, "Cử nhân");
                ba.setSpecializations(
                                createSpecializations(Arrays.asList("QTKD Tổng hợp", "Thương mại điện tử"),
                                                getEconomicsSubjects()));
                majors.add(ba);

                // 10. Fintech
                SchoolMajor fintech = createDetailedMajor(schoolId + "_10", schoolId, "Công nghệ tài chính", "7340120",
                                "Kết hợp Tài chính và Công nghệ (Blockchain, AI in Finance).", 140, "100 chỉ tiêu",
                                "2023: 25.6",
                                "A00, A01, D01",
                                "Blockchain, E-Payment, Financial Modeling, Data Analysis.", "Bank", "Fintech Company",
                                "MoMo, VNPAY",
                                "Specialist", "18-22 tr/năm", 25.6, 4, "Cử nhân");
                fintech.setSpecializations(
                                createSpecializations(Arrays.asList("Thanh toán số", "Phân tích tài chính số"),
                                                getFintechSubjects()));
                majors.add(fintech);

                // 11. Kế toán
                SchoolMajor acc = createDetailedMajor(schoolId + "_11", schoolId, "Kế toán", "7340301",
                                "Kế toán số, Kế toán doanh nghiệp.", 130, "150 chỉ tiêu", "2023: 24.8", "A00, A01, D01",
                                "Nguyên lý kế toán, Kế toán máy, Thuế, Kiểm toán.", "Doanh nghiệp", "Cty Kiểm toán",
                                "Big4",
                                "Accountant", "18-22 tr/năm", 24.8, 4, "Cử nhân");
                acc.setSpecializations(
                                createSpecializations(Arrays.asList("Kế toán doanh nghiệp", "Kiểm toán"),
                                                getEconomicsSubjects()));
                majors.add(acc);

                // 12. AIoT
                SchoolMajor aiot = createDetailedMajor(schoolId + "_12", schoolId, "Công nghệ Internet vạn vật (AIoT)",
                                "7480109",
                                "Kết hợp AI và IoT, xu hướng công nghệ tương lai.", 150, "100 chỉ tiêu", "2023: 25.5",
                                "A00, A01",
                                "Embedded Systems, Sensors, Wireless Comm, AI on Edge.", "Smart City", "Smart Home",
                                "Viettel, VNPT",
                                "IoT Engineer", "18-22 tr/năm", 25.5, 4, "Kỹ sư");
                aiot.setSpecializations(
                                createSpecializations(Arrays.asList("Hệ thống nhúng", "Ứng dụng IoT"),
                                                getITSubjects()));
                majors.add(aiot);
        }

        private static List<Specialization> createSpecializations(List<String> names, List<Subject> subjects) {
                List<Specialization> list = new ArrayList<>();
                int i = 1;
                for (String name : names) {
                        list.add(new Specialization("spec_" + i++, name, subjects));
                }
                return list;
        }

        private static List<Subject> getITSubjects() {
                return Arrays.asList(
                                new Subject("Nhập môn Lập trình (C/C++)", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc", 3, 1, "COT_LOI"),
                                new Subject("Kiến trúc máy tính", 3, 2, "CO_SO_NGANH"),
                                new Subject("Cấu trúc dữ liệu & Giải thuật", 4, 2, "COT_LOI"),
                                new Subject("Cơ sở dữ liệu", 3, 3, "COT_LOI"),
                                new Subject("Mạng máy tính", 3, 3, "COT_LOI"),
                                new Subject("Hệ điều hành", 3, 3, "COT_LOI"),
                                new Subject("Lập trình hướng đối tượng (Java)", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Phát triển ứng dụng Web", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Trí tuệ nhân tạo cơ sở", 3, 4, "CHUYEN_NGANH"),
                                new Subject("An toàn thông tin", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Quản lý dự án phần mềm", 3, 5, "KY_NANG"),
                                new Subject("Thực tập doanh nghiệp", 4, 6, "THUC_TAP"),
                                new Subject("Đồ án tốt nghiệp", 10, 8, "DO_AN"));
        }

        private static List<Subject> getEconomicsSubjects() {
                return Arrays.asList(
                                new Subject("Kinh tế vi mô", 3, 1, "CO_SO_NGANH"),
                                new Subject("Kinh tế vĩ mô", 3, 1, "CO_SO_NGANH"),
                                new Subject("Nguyên lý kế toán", 3, 2, "CO_SO_NGANH"),
                                new Subject("Quản trị học", 3, 2, "CO_SO_NGANH"),
                                new Subject("Marketing căn bản", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tài chính doanh nghiệp", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Luật kinh tế", 3, 3, "BO_TRO"),
                                new Subject("Kinh doanh quốc tế", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thương mại điện tử", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Khởi nghiệp", 3, 5, "KY_NANG"));
        }

        private static List<Subject> getMechanicalSubjects() {
                return Arrays.asList(
                                new Subject("Vẽ kỹ thuật", 3, 1, "CO_SO_NGANH"),
                                new Subject("Cơ lý thuyết", 3, 1, "CO_SO_NGANH"),
                                new Subject("Sức bền vật liệu", 3, 2, "COT_LOI"),
                                new Subject("Nguyên lý máy", 3, 2, "COT_LOI"),
                                new Subject("Chi tiết máy", 3, 3, "COT_LOI"),
                                new Subject("Công nghệ chế tạo máy", 4, 3, "CHUYEN_NGANH"),
                                new Subject("Dung sai và kỹ thuật đo", 2, 3, "CO_SO_NGANH"),
                                new Subject("Vật liệu học", 3, 2, "CO_SO_NGANH"),
                                new Subject("CAD/CAM/CNC", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thủy lực và khí nén", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Đồ án thiết kế máy", 2, 5, "DO_AN"));
        }

        private static List<Subject> getMedicalSubjects() {
                return Arrays.asList(
                                new Subject("Giải phẫu học", 4, 1, "CO_SO_NGANH"),
                                new Subject("Sinh lý học", 3, 1, "CO_SO_NGANH"),
                                new Subject("Hóa sinh", 3, 1, "CO_SO_NGANH"),
                                new Subject("Mô phôi", 3, 2, "CO_SO_NGANH"),
                                new Subject("Vi sinh - Ký sinh trùng", 3, 2, "CO_SO_NGANH"),
                                new Subject("Dược lý học", 3, 3, "CO_SO_NGANH"),
                                new Subject("Bệnh học Nội", 4, 3, "CHUYEN_NGANH"),
                                new Subject("Bệnh học Ngoại", 4, 3, "CHUYEN_NGANH"),
                                new Subject("Sản phụ khoa", 4, 4, "CHUYEN_NGANH"),
                                new Subject("Nhi khoa", 4, 4, "CHUYEN_NGANH"),
                                new Subject("Y học cổ truyền", 2, 5, "BO_TRO"),
                                new Subject("Thực tập lâm sàng", 10, 6, "THUC_TAP"));
        }

        private static List<Subject> getMultimediaSubjects() {
                return Arrays.asList(
                                new Subject("Mỹ thuật cơ bản", 3, 1, "CO_SO_NGANH"),
                                new Subject("Thiết kế đồ họa 2D", 3, 2, "CO_SO_NGANH"),
                                new Subject("Nhiếp ảnh", 3, 2, "CO_SO_NGANH"),
                                new Subject("Xử lý âm thanh - Video", 3, 3, "COT_LOI"),
                                new Subject("Kỹ xảo điện ảnh (VFX)", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thiết kế Web Multimedia", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Phát triển Game (Unity/Unreal)", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Truyền thông đa phương tiện", 3, 5, "KY_NANG"));
        }

        private static List<Subject> getJournalismSubjects() {
                return Arrays.asList(
                                new Subject("Cơ sở lý luận báo chí", 3, 1, "COT_LOI"),
                                new Subject("Lịch sử báo chí", 3, 1, "CO_SO_NGANH"),
                                new Subject("Ngôn ngữ báo chí", 3, 2, "COT_LOI"),
                                new Subject("Phỏng vấn và Trả lời phỏng vấn", 3, 2, "KY_NANG"),
                                new Subject("Báo chí trực tuyến", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Biên tập báo chí", 3, 3, "KY_NANG"),
                                new Subject("Tổ chức sản xuất chương trình", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Luật báo chí và Đạo đức nghề nghiệp", 2, 4, "COT_LOI"));
        }

        private static List<Subject> getFintechSubjects() {
                return Arrays.asList(
                                new Subject("Tài chính - Tiền tệ", 3, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn Fintech", 3, 1, "COT_LOI"),
                                new Subject("Cơ sở dữ liệu tài chính", 3, 2, "CO_SO_NGANH"),
                                new Subject("Blockchain và ứng dụng", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Thanh toán điện tử", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Phân tích dữ liệu tài chính", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Quản trị rủi ro tài chính", 3, 4, "COT_LOI"),
                                new Subject("AI trong Tài chính", 3, 5, "CHUYEN_NGANH"));
        }

        private static SchoolMajor createDetailedMajor(String id, String schoolId, String name, String code,
                        String overview, int credits, String admissionQuota,
                        String benchmarkHistory, String admissionBlocks,
                        String curriculumDetails,
                        String careerDepartments, String careerInstitutes,
                        String careerCorporations, String careerDivisions,
                        String tuitionFee, double benchmarkScore, int duration, String degree) {
                SchoolMajor major = new SchoolMajor(id, schoolId, name);
                major.setCode(code);
                major.setOverview(overview);
                major.setCredits(credits);
                major.setAdmissionQuota(admissionQuota);
                major.setBenchmarkScoreHistory(benchmarkHistory);
                major.setAdmissionBlocks(admissionBlocks);
                major.setCurriculumDetails(curriculumDetails);
                major.setCareerDepartments(careerDepartments);
                major.setCareerInstitutes(careerInstitutes);
                major.setCareerCorporations(careerCorporations);
                major.setCareerDivisions(careerDivisions);
                major.setTuitionFee(tuitionFee);
                major.setBenchmarkScore(benchmarkScore);
                major.setDuration(duration);
                major.setDegree(degree);
                return major;
        }

        private static List<SchoolMajor> getBasicMajorsForSchool(String schoolId) {
                List<SchoolMajor> majors = new ArrayList<>();
                List<School> schools = getSampleSchools();

                for (School school : schools) {
                        if (school.getId().equals(schoolId)) {
                                if (school.getMajors() != null) {
                                        int index = 1;
                                        for (String majorName : school.getMajors()) {
                                                SchoolMajor major = new SchoolMajor(schoolId + "_" + index, schoolId,
                                                                majorName);
                                                if (school.getBenchmarkScores() != null
                                                                && school.getBenchmarkScores().containsKey(majorName)) {
                                                        major.setBenchmarkScore(
                                                                        school.getBenchmarkScores().get(majorName));
                                                }
                                                major.setTuitionFee(school.getTuitionRange());
                                                major.setDuration(4);
                                                major.setDegree("Cử nhân");
                                                majors.add(major);
                                                index++;
                                        }
                                }
                                break;
                        }
                }
                return majors;
        }

        private static List<Subject> getPTITATTTSubjects() {
                return Arrays.asList(
                                // Hoc ky 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Đại số", 3, 1, "CO_SO_NGANH"),

                                // Hoc ky 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Tin học cơ sở 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Vật lý 1 và Thí nghiệm", 4, 2, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật số", 2, 2, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 2, 2, "CO_SO_NGANH"),

                                // Hoc ky 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Ngôn ngữ lập trình C++", 3, 3, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc 1", 3, 3, "CO_SO_NGANH"),
                                new Subject("Kiến trúc máy tính", 3, 3, "CO_SO_NGANH"),
                                new Subject("Vật lý 3 và Thí nghiệm", 4, 3, "CO_SO_NGANH"),

                                // Hoc ky 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Mạng máy tính", 3, 4, "COT_LOI"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 4, "COT_LOI"),
                                new Subject("Toán rời rạc 2", 3, 4, "CO_SO_NGANH"),
                                new Subject("Lý thuyết thông tin", 3, 4, "CO_SO_NGANH"),

                                // Hoc ky 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3 Plus)", 2, 5, "KY_NANG"),
                                new Subject("Hệ điều hành", 3, 5, "COT_LOI"),
                                new Subject("Cơ sở an toàn thông tin", 3, 5, "COT_LOI"),
                                new Subject("Lập trình hướng đối tượng", 3, 5, "COT_LOI"),
                                new Subject("Cơ sở dữ liệu", 3, 5, "COT_LOI"),
                                new Subject("Hệ điều hành Windows và Linux/Unix", 3, 5, "CHUYEN_NGANH"),

                                // Hoc ky 6
                                new Subject("Nhập môn trí tuệ nhân tạo", 3, 6, "COT_LOI"),
                                new Subject("Lập trình Python", 3, 6, "COT_LOI"),
                                new Subject("Mật mã học cơ sở", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Nhập môn công nghệ phần mềm", 3, 6, "COT_LOI"),
                                new Subject("An toàn hệ điều hành", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Thực tập cơ sở", 3, 6, "THUC_TAP"),

                                // Hoc ky 7
                                new Subject("Phương pháp luận NCKH", 2, 7, "KY_NANG"),
                                new Subject("IoT và ứng dụng", 3, 7, "CHUYEN_NGANH"),
                                new Subject("An toàn ứng dụng web và CSDL", 3, 7, "CHUYEN_NGANH"),
                                new Subject("An toàn mạng", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế hệ thống thông tin", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Lập trình Web", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 2, 7, "CHUYEN_NGANH"),

                                // Hoc ky 8
                                new Subject("An toàn mạng nâng cao", 3, 8, "CHUYEN_NGANH"),
                                new Subject("KT theo dõi và giám sát an toàn mạng", 2, 8, "CHUYEN_NGANH"),
                                new Subject("Kiểm thử xâm nhập", 3, 8, "CHUYEN_NGANH"),
                                new Subject("PTƯD cho các thiết bị di động", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Quản lý an toàn thông tin", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 2, 8, "CHUYEN_NGANH"),

                                // Hoc ky 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        private static List<Subject> getPTITITSubjects() {
                return Arrays.asList(
                                // Hoc ky 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Đại số", 3, 1, "CO_SO_NGANH"),

                                // Hoc ky 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Tin học cơ sở 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 2, "BO_TRO"),
                                new Subject("Vật lý ứng dụng", 4, 2, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật số", 2, 2, "CO_SO_NGANH"),

                                // Hoc ky 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Ngôn ngữ lập trình C++", 3, 3, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc 1", 3, 3, "CO_SO_NGANH"),
                                new Subject("Xử lý tín hiệu số", 2, 3, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 3, 3, "CO_SO_NGANH"),

                                // Hoc ky 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Kiến trúc máy tính", 3, 4, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc 2", 3, 4, "CO_SO_NGANH"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 4, "COT_LOI"),
                                new Subject("Lý thuyết thông tin", 3, 4, "CO_SO_NGANH"),

                                // Hoc ky 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3 Plus)", 2, 5, "KY_NANG"),
                                new Subject("Hệ điều hành", 3, 5, "COT_LOI"),
                                new Subject("Lập trình hướng đối tượng", 3, 5, "COT_LOI"),
                                new Subject("Cơ sở dữ liệu", 3, 5, "COT_LOI"),
                                new Subject("Mạng máy tính", 3, 5, "COT_LOI"),
                                new Subject("Lập trình Python", 3, 5, "COT_LOI"),

                                // Hoc ky 6
                                new Subject("Nhập môn công nghệ phần mềm", 3, 6, "COT_LOI"),
                                new Subject("Nhập môn trí tuệ nhân tạo", 3, 6, "COT_LOI"),
                                new Subject("An toàn và bảo mật hệ thống thông tin", 3, 6, "COT_LOI"),
                                new Subject("Lập trình web", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Cơ sở dữ liệu phân tán", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thực tập cơ sở", 4, 6, "THUC_TAP"),

                                // Hoc ky 7
                                new Subject("QLDA phần mềm", 3, 7, "CHUYEN_NGANH"),
                                new Subject("IoT và ứng dụng", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế HTTT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Xử lý ảnh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 6, 7, "CHUYEN_NGANH"),

                                // Hoc ky 8
                                new Subject("Thiết kế mạng máy tính", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Đánh giá hiệu năng mạng", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Quản lý mạng máy tính", 3, 8, "CHUYEN_NGANH"),
                                new Subject("An ninh mạng", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phương pháp luận nghiên cứu khoa học", 2, 8, "KY_NANG"),

                                // Hoc ky 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }
}

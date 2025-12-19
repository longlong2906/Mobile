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
                School bkhn = new School("1", "Đại học Bách Khoa Hà Nội", "HUST", "Bắc", "Công lập");
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
                                "Kỹ thuật hóa học", "Khoa học máy tính", "Kỹ thuật điều khiển & Tự động hóa",
                                "Toán - Tin", "Kỹ thuật Máy tính", "Khoa học dữ liệu và Trí tuệ nhân tạo",
                                "Vật lý Kỹ thuật", "Công nghệ Dệt May", "Kỹ thuật Sinh học",
                                "Kỹ thuật Thực phẩm", "Quản trị Kinh doanh (TROY)", "Kỹ thuật Y sinh",
                                "Kỹ thuật Cơ điện tử", "Kỹ thuật Điện", "Kỹ thuật Vật liệu",
                                "Kỹ thuật Môi trường", "Quản lý Công nghiệp", "Ngôn ngữ Anh",
                                "Kỹ thuật Nhiệt", "Kỹ thuật Ô tô", "Logistics và QL Chuỗi cung ứng",
                                "Tài chính - Ngân hàng", "Kế toán"));
                bkhn.setTuitionRange("25 - 40 triệu/năm (Chương trình chuẩn)");
                bkhn.setFacilities(Arrays.asList(
                                "Thư viện Tạ Quang Bửu hiện đại nhất ĐNA",
                                "Hệ thống phòng thí nghiệm trọng điểm quốc gia",
                                "Sân vận động Bách Khoa",
                                "Ký túc xá tiện nghi"));
                bkhn.setClubs(Arrays.asList("CLB Nghiên cứu khoa học", "CLB Hỗ trợ học tập",
                                "CLB - LAB NGHIÊN CỨU & SÁNG TẠO",
                                "CLB Chuyển đổi số trong Giáo dục", "CLB An Toàn Thông Tin - BKHN",
                                "CLB GOOGLE DEVELOPER STUDENT CLUB", "CLB Chuyển đổi số trong Giáo dục",
                                "CLB Hỗ trợ học tập tiếng Nhật- NJC Nagaoka Japan Club (trường Cơ khí)",
                                "CLB SÁNG TẠO VÀ KHỞI NGHIỆP HUST - HIEC", "CLB Tiếng Anh Cơ Khí MEC (MEC)"));
                bkhn.setAdmissionPolicy(
                                "Tuyển sinh dựa trên kết quả thi THPT Quốc gia, thi Đánh giá tư duy, tuyển thẳng tài năng.");
                Map<String, Double> bkhnScores = new HashMap<>();
                bkhnScores.put("Công nghệ thông tin (Global ICT)", 28.01);
                bkhnScores.put("Khoa học máy tính", 28.53);
                bkhnScores.put("Kỹ thuật điều khiển & Tự động hóa", 27.54);
                bkhnScores.put("Kỹ thuật Cơ khí", 27.49);
                bkhnScores.put("Toán - Tin", 27.35);
                bkhnScores.put("Kỹ thuật Máy tính", 28.48);
                bkhnScores.put("Khoa học dữ liệu và Trí tuệ nhân tạo", 28.22);
                bkhnScores.put("Vật lý Kỹ thuật", 25.87);
                bkhnScores.put("Công nghệ Dệt May", 24.5);
                bkhnScores.put("Kỹ thuật Hóa học", 25.0);
                bkhnScores.put("Kỹ thuật Sinh học", 25.0);
                bkhnScores.put("Kỹ thuật Thực phẩm", 25.0);
                bkhnScores.put("Quản trị Kinh doanh (TROY)", 21.0);
                bkhnScores.put("Kỹ thuật Y sinh", 25.04);
                bkhnScores.put("Kỹ thuật Cơ điện tử", 27.49);
                bkhnScores.put("Kỹ thuật Điện", 26.81);
                bkhnScores.put("Kỹ thuật Vật liệu", 25.0);
                bkhnScores.put("Kỹ thuật Môi trường", 25.0);
                bkhnScores.put("Quản lý Công nghiệp", 25.39);
                bkhnScores.put("Ngôn ngữ Anh", 25.45);
                bkhnScores.put("Kỹ thuật Nhiệt", 25.2);
                bkhnScores.put("Kỹ thuật Ô tô", 26.81);
                bkhnScores.put("Logistics và QL Chuỗi cung ứng", 26.06);
                bkhnScores.put("Tài chính - Ngân hàng", 25.77);
                bkhnScores.put("Kế toán", 25.8);
                bkhnScores.put("Kỹ thuật Sinh học", 25.0);
                bkhnScores.put("Kỹ thuật Thực phẩm", 25.0);
                bkhnScores.put("Quản trị Kinh doanh (TROY)", 21.0);
                bkhnScores.put("Kỹ thuật Y sinh", 25.04); // 2023
                bkhnScores.put("Kỹ thuật Cơ điện tử", 27.49);
                bkhn.setBenchmarkScores(bkhnScores);
                bkhn.setAdmissionQuota("7,500 chỉ tiêu");
                bkhn.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét tuyển tài năng", "Thi Đánh giá tư duy"));
                schools.add(bkhn);

                // 2. ĐH Công nghệ - ĐHQGHN (UET) - Thay thế cho ĐH Quốc gia chung chung
                School uet = new School("2", "Đại học Công nghệ - ĐHQGHN", "UET", "Bắc", "Công lập");
                uet.setImageUrl("https://2489013871.e.cdneverest.net/uet.edu.vn/2025/08/IMG_4734.jpg");
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
                uet.setClubs(Arrays.asList("CLB Nghệ Thuật trường Đại học Công nghệ (Passion Club)",
                                "CLB Thuyết trình trường Đại học Công nghệ",
                                "CLB Hàng không Vũ trụ trường Đại học Công nghệ (ACUET)",
                                "CLB Tiếng Anh trường Đại học Công nghệ (EC)",
                                "CLB Cầu lông trường Đại học Công nghệ (B-UET)",
                                "CLB Robotics trường Đại học Công nghệ (RCUET)",
                                "CLB Trí tuệ Nhân tạo trường Đại học Công nghệ (AI-UET)"));
                uet.setAdmissionPolicy(
                                "Tuyển sinh theo quy chế của ĐHQGHN, ưu tiên thí sinh có chứng chỉ quốc tế SAT, A-Level.");
                Map<String, Double> uetScores = new HashMap<>();
                uetScores.put("Công nghệ thông tin", 27.8);
                uetScores.put("Trí tuệ nhân tạo", 27.58);
                uetScores.put("Kỹ thuật máy tính", 27.0); // Ước lượng
                uet.setBenchmarkScores(uetScores);
                uet.setAdmissionQuota("1,800 chỉ tiêu");
                uet.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực ĐHQGHN", "Chứng chỉ quốc tế"));
                schools.add(uet);

                // 3. ĐH FPT
                School fpt = new School("3", "Đại học FPT", "ĐH FPT", "Bắc", "Dân lập");
                fpt.setImageUrl(
                                "https://daihoc.fpt.edu.vn/wp-content/uploads/2024/03/dai-hoc-fpt-da-nang-1-1024x576.jpeg");
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
                fpt.setClubs(Arrays.asList(" CLB Văn hóa nghệ thuật", "CLB Tiếng Trung", "CLB Melody", "CLB Guitar",
                                "CLB Kỹ sư phần mềm Nhật Bản JS", "CLB F-Code"));
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
                                "Trí tuệ nhân tạo vạn vật (AIoT)", "Logistics và quản trị chuỗi cung ứng",
                                "Quan hệ công chúng"));
                ptit.setTuitionRange("18 - 22 triệu/năm");
                ptit.setFacilities(Arrays.asList("Hạ tầng mạng mạnh", "Lab Samsung, Lab Huawei", "Smart Classroom"));
                ptit.setClubs(Arrays.asList("CLB Lập trình PTIT", "CLB An toàn thông tin (ISP)", "CLB IT PTIT",
                                "CLB Văn hóa nghệ thuật",
                                "Đội Thanh niên vận động hiến máu Học viện Công nghệ Bưu chính Viễn thông",
                                "CLB Bóng đá Bưu chính", "CLB Nhà Sáng Tạo Game PTIT",
                                "CLB Guitar Học viện Công nghệ Bưu chính Viễn thông - PGC", "CLB Taekwondo PTIT",
                                "CLB Multimedia PTIT", "CLB GDSC PTIT", "CLB MC PTIT - MCP",
                                "CLB Hỗ trợ Học tập - LSC PTIT",
                                "CLB Sách và Hành động PTIT", "UP Community", "CLB công nghệ thông tin UDU",
                                "Đội cờ đỏ PTIT", "CLB EMA", "CLB Truyền Thông & Kỹ Năng Mềm S4C - PTIT",
                                "CLB Sổ Media", "CLB Điện tử PTIT", "CLB Guitar PTIT - GPC", "ĐỘI LỄ TÂN PTIT"));
                ptit.setAdmissionPolicy("Tuyển sinh khối A00, A01, D01. Điểm chuẩn thuộc top đầu các trường kỹ thuật.");
                Map<String, Double> ptitScores = new HashMap<>();
                ptitScores.put("Công nghệ thông tin", 25.80);
                ptitScores.put("An toàn thông tin", 25.21);
                ptitScores.put("Điện tử viễn thông", 25.10);
                ptitScores.put("Khoa học máy tính", 26.21);
                ptitScores.put("Trí tuệ nhân tạo", 25.67);
                ptitScores.put("Trí tuệ nhân tạo vạn vật (AIoT)", 24.87);
                ptitScores.put("Báo chí", 22.67);
                ptitScores.put("Truyền thông đa phương tiện", 25.25);
                ptitScores.put("Quản trị kinh doanh", 22.75);
                ptitScores.put("Công nghệ tài chính", 23.63);
                ptitScores.put("Kế toán", 22.50);
                ptitScores.put("Kỹ thuật Điều khiển và tự động hóa", 26.19);
                ptitScores.put("Công nghệ Kỹ thuật Điện, điện tử", 24.61);
                ptitScores.put("Công nghệ vi mạch bán dẫn", 25.50);
                ptitScores.put("Kỹ thuật dữ liệu", 24.40);
                ptitScores.put("Công nghệ đa phương tiện", 24.00);
                ptitScores.put("Logistics và quản trị chuỗi cung ứng", 24.20);
                ptitScores.put("Thương mại điện tử", 25.10);
                ptitScores.put("Marketing", 24.00);
                ptitScores.put("Quan hệ công chúng", 23.47);
                ptit.setBenchmarkScores(ptitScores);
                ptit.setAdmissionQuota("3,800 chỉ tiêu");
                ptit.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Tuyển thẳng", "Xét kết hợp"));
                schools.add(ptit);

                // ========== KHU VỰC TRUNG ==========

                // 5. ĐH Đà Nẵng (Đại diện Bách Khoa Đà Nẵng)
                School ud = new School("5", "Trường Đại học Bách Khoa - ĐH Đà Nẵng", "DUT", "Trung", "Công lập");
                ud.setImageUrl("https://dut.udn.vn/Files/admin/images/Tin_tuc/Daotao/2017/HCERES/image002.png");
                ud.setAddress("54 Nguyễn Lương Bằng, Liên Chiểu, Đà Nẵng");
                ud.setWebsite("https://dut.udn.vn");
                ud.setDescription("Trường kỹ thuật đầu ngành khu vực miền Trung - Tây Nguyên.");
                ud.setMajors(Arrays.asList("Công nghệ thông tin", "Kỹ thuật điện", "Kỹ thuật xây dựng", "Kiến trúc",
                                "Công nghệ dầu khí"));
                ud.setTuitionRange("15 - 25 triệu/năm");
                ud.setFacilities(Arrays.asList("Khu thí nghiệm công nghệ cao", "Phòng Maker Space", "Thư viện số"));
                ud.setClubs(Arrays.asList("CLB Kỹ năng mềm SClub", "CLB Tiếng Anh", "CLB Guitar Sinh viên Đà Nẵng"));
                Map<String, Double> udScores = new HashMap<>();
                udScores.put("Công nghệ thông tin", 27.11);
                udScores.put("Kỹ thuật xây dựng", 20.0);
                udScores.put("Kỹ thuật điện", 23.5);
                ud.setBenchmarkScores(udScores);
                ud.setAdmissionQuota("3,500 chỉ tiêu");
                ud.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét học bạ"));
                schools.add(ud);

                // 6. ĐH Y Dược Huế
                School hue = new School("6", "Trường Đại học Y Dược - ĐH Huế", "HueUMP", "Trung", "Công lập");
                hue.setImageUrl("https://www.huemed-univ.edu.vn/images/dai-hoc-y-duoc-hue-2022.jpg");
                hue.setAddress("06 Ngô Quyền, Vĩnh Ninh, Huế");
                hue.setWebsite("https://huemed-univ.edu.vn");
                hue.setDescription("Trường đào tạo y khoa uy tín lâu đời tại miền Trung.");
                hue.setMajors(Arrays.asList("Y khoa", "Răng Hàm Mặt", "Dược học", "Điều dưỡng", "Y học cổ truyền"));
                hue.setTuitionRange("20 - 40 triệu/năm");
                Map<String, Double> hueScores = new HashMap<>();
                hueScores.put("Y khoa", 26.3);
                hueScores.put("Dược học", 24.55);
                hueScores.put("Răng Hàm Mặt", 25.95);
                hue.setBenchmarkScores(hueScores);
                hue.setAdmissionQuota("1,500 chỉ tiêu");
                hue.setAdmissionMethods(Arrays.asList("Xét thi THPT"));
                hue.setClubs(Arrays.asList("CLB Nội khoa Sinh viên (IMC)", "CLB Dược lâm sàng (CPC)", "CLB Blouse Xanh",
                                "CLB Hiến Máu Tình Nguyện"));
                schools.add(hue);

                // ========== KHU VỰC NAM ==========

                // 7. ĐH Bách Khoa TP.HCM
                School hcmut = new School("7", "Đại học Bách Khoa TP.HCM", "HCMUT", "Nam", "Công lập");
                hcmut.setImageUrl("https://jola.vn/Article/psS8zDlN2/article-1553754237-189.png");
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
                hcmutScores.put("Khoa học máy tính", 84.16); // Điểm tổng hợp
                hcmutScores.put("Logistics", 80.10);
                hcmutScores.put("Kỹ thuật Ô tô", 78.22);
                hcmut.setBenchmarkScores(hcmutScores);
                hcmut.setAdmissionQuota("5,000 chỉ tiêu");
                hcmut.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực ĐHQG", "Ưu tiên xét tuyển"));
                hcmut.setClubs(Arrays.asList("CLB Tiếng Anh (UTEC)", "CLB Văn nghệ OISP (BOMB)", "CLB Guitar (OGC)",
                                "CLB Tình nguyện (OVC)", "CLB Kỹ sư không biên giới"));
                schools.add(hcmut);

                // 8. ĐH Kinh tế TP.HCM
                School ueh = new School("8", "Đại học Kinh tế TP.HCM", "UEH", "Nam", "Công lập");
                ueh.setImageUrl("https://nld.mediacdn.vn/zoom/700_438/291774122806476800/2023/10/6/ueh-16965806117511654523010.jpeg");
                ueh.setAddress("59C Nguyễn Đình Chiểu, Q.3, TP.HCM (và nhiều cơ sở khác)");
                ueh.setWebsite("https://ueh.edu.vn");
                ueh.setDescription("Trường đại học đa ngành, trọng điểm về kinh tế, quản lý và luật.");
                ueh.setMajors(Arrays.asList("Kinh doanh quốc tế", "Marketing", "Tài chính - Ngân hàng", "Kế toán",
                                "Công nghệ Marketing"));
                ueh.setTuitionRange("25 - 45 triệu/năm");
                Map<String, Double> uehScores = new HashMap<>();
                uehScores.put("Kinh doanh quốc tế", 27.7);
                uehScores.put("Marketing", 27.5);
                uehScores.put("Kế toán", 22.50);
                uehScores.put("Logistics và quản trị chuỗi cung ứng", 25.50); // Ước tính
                ueh.setBenchmarkScores(uehScores);
                ueh.setAdmissionQuota("7,000 chỉ tiêu");
                ueh.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Đánh giá năng lực", "Xét học bạ"));
                ueh.setClubs(Arrays.asList("CLB Chứng khoán (SCUE)", "CLB Tư duy phản biện (CTC)", "CLB Guitar (UEHG)",
                                "CLB Tiếng Anh (BELL)", "Nhóm Margroup"));
                schools.add(ueh);

                // 9. ĐH RMIT Nam
                School rmit = new School("9", "Đại học RMIT Việt Nam", "RMIT", "Nam", "Quốc tế");
                rmit.setImageUrl(
                                "https://www.rmit.edu.vn/content/dam/rmit/vn/en/assets-for-production/images/rmit-sgs-campus-facilities/2019-campus-photos/sgs-campus-night-05.jpg");
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
                rmit.setClubs(Arrays.asList("Business Club", "English Club", "RMIT Music Club", "Dance Club",
                                "Basketball Club", "Football Club"));
                schools.add(rmit);

                // 10. ĐH Y Dược TP.HCM
                School yds = new School("10", "Đại học Y Dược TP.HCM", "UMP", "Nam", "Công lập");
                yds.setImageUrl("https://khpt.1cdn.vn/2025/06/11/image.png");
                yds.setAddress("217 Hồng Bàng, Q.5, TP.HCM");
                yds.setWebsite("https://yds.edu.vn");
                yds.setDescription("Trung tâm đào tạo nhân lực y tế, nghiên cứu khoa học lớn nhất phía Nam.");
                yds.setMajors(Arrays.asList("Y khoa", "Răng Hàm Mặt", "Dược học", "Kỹ thuật hình ảnh y học"));
                yds.setTuitionRange("40 - 70 triệu/năm");
                Map<String, Double> ydsScores = new HashMap<>();
                ydsScores.put("Y khoa", 27.8);
                ydsScores.put("Răng Hàm Mặt", 27.35);
                ydsScores.put("Dược học", 25.72);
                yds.setBenchmarkScores(ydsScores);
                yds.setAdmissionQuota("2,300 chỉ tiêu");
                yds.setAdmissionMethods(Arrays.asList("Xét thi THPT", "Xét tuyển thẳng"));
                yds.setClubs(Arrays.asList("CLB Bóng Rổ UMP", "CLB Cờ Vua", "Pharmacy English Club (PEC)",
                                "CLB Công tác xã hội", "CLB Truyền Thông Sáng Tạo"));
                schools.add(yds);

                // 12. ĐH Tôn Đức Thắng
                School tdtu = new School("12", "Đại học Tôn Đức Thắng", "TDTU", "Nam", "Công lập");
                tdtu.setImageUrl(
                                "https://lambangdaihoc.org/wp-content/uploads/2024/07/truong-dai-hoc-ton-duc-thang-la-truong-cong-hay-tu-thong-tin-chi-tiet-66949aba27373.webp");
                tdtu.setAddress("19 Nguyễn Hữu Thọ, Q.7, TP.HCM");
                tdtu.setWebsite("https://tdtu.edu.vn");
                tdtu.setDescription("Trường đại học công lập tự chủ toàn diện, cơ sở vật chất 5 sao.");
                tdtu.setMajors(Arrays.asList("Kỹ thuật phần mềm", "Kế toán", "Luật học", "Quản trị kinh doanh",
                                "Du lịch"));
                tdtu.setTuitionRange("25 - 50 triệu/năm");
                tdtu.setFacilities(Arrays.asList("Nhà thi đấu đa năng", "Thư viện truyền cảm hứng",
                                "Sân vận động FIFA 2 sao"));
                Map<String, Double> tdtuScores = new HashMap<>();
                tdtuScores.put("Kỹ thuật phần mềm", 33.3); // Thang 40
                tdtuScores.put("Marketing", 34.25);
                tdtuScores.put("Quản trị kinh doanh", 32.5);
                tdtu.setBenchmarkScores(tdtuScores);
                tdtu.setAdmissionQuota("6,500 chỉ tiêu");
                tdtu.setAdmissionMethods(Arrays.asList("Xét học bạ", "Xét thi THPT", "Ưu tiên xét tuyển"));
                tdtu.setClubs(Arrays.asList("CLB Võ thuật (Karatedo, Taekwondo)", "TDT Band", "CLB Guitar G4U",
                                "CLB Kỹ năng Skill Club", "CLB Tiếng Anh", "CLB Tin học IT-Zone"));
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
                                majors.add(createDetailedMajor("1_3", "1", "Kỹ thuật Điện", "EE1",
                                                "Đào tạo kỹ sư có kiến thức chuyên sâu về hệ thống điện, thiết bị điện, năng lượng tái tạo và lưới điện thông minh.",
                                                160,
                                                "500 chỉ tiêu", "2024: 26.81\n2023: 26.5", "A00, A01",
                                                "Mạch điện, Trường điện từ, Hệ thống điện, Máy điện, Điện tử công suất, Năng lượng tái tạo...",
                                                "Tập đoàn điện lực (EVN), Các nhà máy điện, Công ty thiết bị điện",
                                                "Viện Điện",
                                                "EVN, Siemens, ABB, Schneider Electric",
                                                "Kỹ sư hệ thống điện",
                                                "25 - 30 triệu/năm", 26.81, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Hệ thống điện", "Thiết bị điện"),
                                                                getEE_Subjects()));

                                majors.add(createDetailedMajor("1_4", "1", "Kỹ thuật Vật liệu", "MS1",
                                                "Chương trình đào tạo theo chuẩn CDIO, trang bị kiến thức về vật liệu tiên tiến, vật liệu nano, vật liệu y sinh.",
                                                155,
                                                "200 chỉ tiêu", "2024: ~25.0\n2023: 24.5", "A00, A01",
                                                "Khoa học vật liệu đại cương, Vật liệu kim loại, Ceramic, Polymer, Vật liệu Nano...",
                                                "Các công ty sản xuất vật liệu, Viện nghiên cứu", "Viện KH&KT Vật liệu",
                                                "Hòa Phát, Samsung, Viện Khoa học Vật liệu",
                                                "Kỹ sư R&D",
                                                "25 - 30 triệu/năm", 25.0, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Vật liệu tiên tiến"),
                                                                getMaterials_Subjects()));

                                majors.add(createDetailedMajor("1_5", "1", "Kỹ thuật Môi trường", "EV1",
                                                "Đào tạo kỹ sư có khả năng thiết kế, vận hành các hệ thống xử lý ô nhiễm và quản lý tài nguyên môi trường.",
                                                150,
                                                "150 chỉ tiêu", "2024: ~25.0\n2023: 21.0", "A00, B00",
                                                "Hóa môi trường, Xử lý nước thải, Xử lý khí thải, Quản lý chất thải rắn...",
                                                "Công ty môi trường, Cơ quan quản lý nhà nước", "Viện KH&CN Môi trường",
                                                "URENCO, Các khu công nghiệp",
                                                "Kỹ sư môi trường",
                                                "22 - 28 triệu/năm", 25.0, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Công nghệ môi trường"),
                                                                getEnvironmental_Subjects()));

                                majors.add(createDetailedMajor("1_6", "1", "Quản lý Công nghiệp", "EM2",
                                                "Kết hợp kiến thức kỹ thuật và quản lý kinh tế, giúp tối ưu hóa hệ thống sản xuất và dịch vụ.",
                                                135,
                                                "80 chỉ tiêu", "2024: 25.39\n2023: 25.39", "A00, A01",
                                                "Quản trị dự án, Quản lý sản xuất, Kinh tế lượng, Logistics căn bản...",
                                                "Nhà máy sản xuất, Công ty Logistics", "Viện Kinh tế & Quản lý",
                                                "Samsung, Toyota, Unilever",
                                                "Quản lý sản xuất",
                                                "24 - 30 triệu/năm", 25.39, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Quản lý sản xuất", "Logistics"),
                                                                getIndMgmt_Subjects()));

                                majors.add(createDetailedMajor("1_7", "1", "Ngôn ngữ Anh", "FL1",
                                                "Tiếng Anh Khoa học Kỹ thuật và Công nghệ (FL1). Đào tạo chuyên sâu về tiếng Anh dùng trong môi trường kỹ thuật.",
                                                130,
                                                "100 chỉ tiêu", "2024: 25.45\n2023: 25.45", "D01",
                                                "Tiếng Anh chuyên ngành Kỹ thuật, Biên phiên dịch, Văn hóa Anh-Mỹ...",
                                                "Công ty đa quốc gia, Tổ chức quốc tế", "Viện Ngoại ngữ",
                                                "Samsung, LG, Các tổ chức NGO",
                                                "Biên phiên dịch kỹ thuật",
                                                "22 - 28 triệu/năm", 25.45, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Tiếng Anh KHKT"),
                                                                getEnglish_Subjects()));

                                majors.add(createDetailedMajor("1_8", "1", "Kỹ thuật Nhiệt", "HE1",
                                                "Đào tạo kỹ sư về hệ thống nhiệt, lạnh, điều hòa không khí và năng lượng tái tạo.",
                                                155,
                                                "200 chỉ tiêu", "2024: 25.2\n2023: 24.8", "A00, A01",
                                                "Nhiệt động học, Truyền nhiệt, Kỹ thuật lạnh, Điều hòa không khí, Năng lượng mặt trời...",
                                                "Nhà máy nhiệt điện, Công ty cơ điện lạnh (REE)", "Viện Nhiệt lạnh",
                                                "Daikin, Panasonic, EVN",
                                                "Kỹ sư nhiệt lạnh",
                                                "25 - 30 triệu/năm", 25.2, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Điện lạnh", "Năng lượng tái tạo"),
                                                                getThermal_Subjects()));

                                majors.add(createDetailedMajor("1_9", "1", "Kỹ thuật Ô tô", "TE1",
                                                "Ngành hot với nhu cầu nhân lực cao, tập trung vào thiết kế, chế tạo và các công nghệ mới trên ô tô (xe điện, tự lái).",
                                                160,
                                                "300 chỉ tiêu", "2024: 26.81\n2023: 26.5", "A00, A01",
                                                "Động cơ đốt trong, Lý thuyết ô tô, Thiết kế ô tô, Ô tô điện, Hệ thống điều khiển trên ô tô...",
                                                "Các hãng sản xuất ô tô (VinFast, Toyota, Hyundai)",
                                                "Viện Cơ khí Động lực",
                                                "VinFast, Toyota, Thaco",
                                                "Kỹ sư thiết kế ô tô",
                                                "25 - 35 triệu/năm", 26.81, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Công nghệ ô tô", "Ô tô điện"),
                                                                getAutomotive_Subjects()));

                                majors.add(createDetailedMajor("1_10", "1", "Logistics và QL Chuỗi cung ứng", "EM-E14",
                                                "Chương trình tiên tiến đào tạo chuyên gia về Logistics trong kỷ nguyên số.",
                                                140,
                                                "100 chỉ tiêu", "2024: 26.06\n2023: 26.0", "A00, A01",
                                                "Quản trị chuỗi cung ứng, Vận tải đa phương thức, Kho hàng, E-Logistics, Phân tích dữ liệu...",
                                                "Các công ty Logistics toàn cầu, Tập đoàn bán lẻ",
                                                "Viện Kinh tế & Quản lý",
                                                "DHL, Maersk, Shopee, Lazada",
                                                "Chuyên viên Logistics",
                                                "40 - 45 triệu/năm", 26.06, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Logistics", "SCM"),
                                                                getLogistics_Subjects()));

                                majors.add(createDetailedMajor("1_11", "1", "Tài chính - Ngân hàng", "EM3",
                                                "Tập trung vào Tài chính công nghệ (Fintech) và phân tích tài chính định lượng.",
                                                130,
                                                "100 chỉ tiêu", "2024: 25.77\n2023: 25.5", "A00, A01",
                                                "Tài chính doanh nghiệp, Thị trường chứng khoán, Ngân hàng số, Quản trị rủi ro...",
                                                "Ngân hàng, Công ty chứng khoán, Quỹ đầu tư", "Viện Kinh tế & Quản lý",
                                                "Techcombank, VPS, SSI",
                                                "Chuyên viên phân tích tài chính",
                                                "24 - 30 triệu/năm", 25.77, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Tài chính doanh nghiệp"),
                                                                getFinance_Subjects()));

                                majors.add(createDetailedMajor("1_12", "1", "Kế toán", "EM4",
                                                "Chương trình đào tạo được kiểm định quốc tế (CPA Australia), chú trọng chuẩn mực quốc tế (IFRS).",
                                                130,
                                                "120 chỉ tiêu", "2024: 25.8\n2023: 25.5", "A00, A01",
                                                "Kế toán tài chính(IFRS), Kế toán quản trị, Kiểm toán, Hệ thống thông tin kế toán...",
                                                "Công ty kiểm toán (Big4), Tập đoàn đa quốc gia",
                                                "Viện Kinh tế & Quản lý",
                                                "Deloitte, EY, PwC, KPMG",
                                                "Kiểm toán viên",
                                                "24 - 30 triệu/năm", 25.8, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Kế toán - Kiểm toán"),
                                                                getAccountingHust_Subjects()));

                                // --- CÁC NGÀNH MỚI BỔ SUNG (IT1, IT2, MI1, EE-E8, ET1, v.v.) ---
                                majors.add(createDetailedMajor("1_13", "1", "Khoa học máy tính", "IT1",
                                                "Chương trình CNTT gia công chuyên gia về phần mềm, hệ thống thông minh, phân tích dữ liệu.",
                                                160,
                                                "300 chỉ tiêu", "2024: 28.53\n2023: 29.42", "A00, A01",
                                                "Cấu trúc dữ liệu, Giải thuật, Trí tuệ nhân tạo, Công nghệ phần mềm...",
                                                "Công ty công nghệ, Tập đoàn phần mềm", "Trường CNTT&TT",
                                                "Google, Facebook, Viettel, FPT",
                                                "Kỹ sư phần mềm, Chuyên gia AI",
                                                "30 - 50 triệu/năm", 28.53, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(
                                                                Arrays.asList("Công nghệ phần mềm",
                                                                                "Hệ thống thông tin"),
                                                                getIT1Subjects()));

                                majors.add(createDetailedMajor("1_14", "1", "Kỹ thuật Máy tính", "IT2",
                                                "Kết hợp CNTT và Điện tử, tập trung vào hệ thống nhúng, IoT và an ninh mạng.",
                                                160,
                                                "150 chỉ tiêu", "2024: 28.48\n2023: 28.29", "A00, A01",
                                                "Hệ nhúng, IoT, Mạng máy tính, An ninh mạng...",
                                                "Công ty sản xuất thiết bị thông minh, Viettel, VNPT", "Trường CNTT&TT",
                                                "Samsung, Viettel, FPT",
                                                "Kỹ sư hệ thống nhúng, Chuyên gia an ninh mạng",
                                                "25 - 40 triệu/năm", 28.48, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(
                                                                Arrays.asList("Hệ nhúng & IoT", "An toàn thông tin"),
                                                                getIT2Subjects()));

                                majors.add(createDetailedMajor("1_15", "1", "Khoa học dữ liệu và Trí tuệ nhân tạo",
                                                "IT-E10",
                                                "Chương trình tiên tiến đào tạo chuyên gia DS & AI hàng đầu, học bằng tiếng Anh.",
                                                160,
                                                "100 chỉ tiêu", "2024: 28.22\n2023: 28.80", "A00, A01",
                                                "Machine Learning, Deep Learning, Big Data, Data Mining...",
                                                "Tập đoàn công nghệ, Ngân hàng, Fintech", "Trường CNTT&TT",
                                                "VinAI, FPT.AI, Viettel",
                                                "Data Scientist, AI Engineer",
                                                "40 - 70 triệu/năm", 28.22, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Data Science", "AI"),
                                                                getITE10Subjects()));

                                majors.add(createDetailedMajor("1_16", "1", "Toán - Tin", "MI1",
                                                "Đào tạo nền tảng toán học vững chắc kết hợp với kỹ năng tin học ứng dụng.",
                                                155,
                                                "150 chỉ tiêu", "2024: 27.35\n2023: 27.2", "A00, A01",
                                                "Toán ứng dụng, Tin học, Tài chính định lượng, An toàn thông tin...",
                                                "Ngân hàng, Công ty chứng khoán, Công ty CNTT",
                                                "Viện Toán ứng dụng & Tin học",
                                                "Techcombank, VPS, FPT",
                                                "Chuyên viên phân tích dữ liệu, Quants",
                                                "25 - 35 triệu/năm", 27.35, 4, "Cử nhân"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Toán ứng dụng", "Tin học"),
                                                                getMI1Subjects()));

                                majors.add(createDetailedMajor("1_17", "1", "Kỹ thuật điều khiển & Tự động hóa",
                                                "EE-E8",
                                                "Chương trình tiên tiến về Tự động hóa, đào tạo kỹ sư chất lượng cao hội nhập quốc tế.",
                                                160,
                                                "100 chỉ tiêu", "2024: 27.54\n2023: 27.5", "A00, A01",
                                                "Điều khiển tự động, Robot, Hệ thống đo lường, PLC...",
                                                "Nhà máy tự động hóa, Tập đoàn công nghiệp", "Trường Điện - Điện tử",
                                                "Siemens, ABB, Samsung",
                                                "Kỹ sư tự động hóa",
                                                "25 - 35 triệu/năm", 27.54, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(
                                                                Arrays.asList("Tự động hóa", "Điều khiển thông minh"),
                                                                getEEE8Subjects()));

                                majors.add(createDetailedMajor("1_18", "1", "Kỹ thuật Điện tử - Viễn thông", "ET1",
                                                "Ngành cốt lõi về phần cứng, viễn thông và iot.",
                                                160,
                                                "300 chỉ tiêu", "2024: 26.5\n2023: 26.0", "A00, A01",
                                                "Mạch điện tử, Vi xử lý, Hệ thống viễn thông, Anten, 5G...",
                                                "Tập đoàn viễn thông, Công ty điện tử", "Trường Điện - Điện tử",
                                                "Viettel, VNPT, Samsung",
                                                "Kỹ sư thiết kế mạch, Kỹ sư viễn thông",
                                                "20 - 30 triệu/năm", 26.5, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("Điện tử", "Viễn thông"),
                                                                getET1Subjects()));

                                majors.add(createDetailedMajor("1_19", "1", "Công nghệ Dệt May", "TX1",
                                                "Đào tạo kỹ sư công nghệ may và thời trang.", 150, "100 chỉ tiêu",
                                                "2024: 24.5", "A00, A01",
                                                "Vật liệu dệt, Công nghệ may, Thiết kế thời trang...",
                                                "Công ty may mặc", "Viện Dệt may", "Vinatex", "Kỹ sư công nghệ may",
                                                "15-20 triệu/năm", 24.5, 5, "Kỹ sư"));
                                majors.get(majors.size() - 1).setSpecializations(
                                                createSpecializations(Arrays.asList("CN May"), getTX1Subjects()));

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

                List<Specialization> itSpecs = new ArrayList<>();
                itSpecs.add(new Specialization("spec_1", "Mạng máy tính và truyền thông dữ liệu", getPTITITSubjects())); // Default/General
                                                                                                                         // (Network)
                itSpecs.add(new Specialization("spec_2", "Công nghệ phần mềm", getPTIT_SE_Subjects())); // New specific
                                                                                                        // SE curriculum
                itSpecs.add(new Specialization("spec_3", "Hệ thống thông tin", getPTIT_IS_Subjects())); // Specific IS
                                                                                                        // curriculum
                it.setSpecializations(itSpecs);

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
                                createSpecializations(Arrays.asList("An toàn thông tin"),
                                                getPTITATTTSubjects()));
                majors.add(attt);

                // 3. ĐTVT
                SchoolMajor dtvt = createDetailedMajor(schoolId + "_3", schoolId, "Kỹ thuật Điện tử viễn thông",
                                "7520207",
                                "Ngành Kỹ thuật Điện tử viễn thông đào tạo kỹ sư có kiến thức nền tảng và chuyên sâu về: Mạng và dịch vụ Internet, Thông tin vô tuyến và di động (4G/5G/6G), Hệ thống IoT. Chương trình thiết kế theo chuẩn quốc tế, chú trọng thực hành và các công nghệ mới như Điện toán đám mây, An toàn mạng, Big Data trong viễn thông.",
                                150,
                                "Năm 2024: 420\nNăm 2023: 420",
                                "Năm 2024: 25.68\nNăm 2023: 25.68",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Kiến thức về Mạch điện tử, Tín hiệu, Hệ thống viễn thông, IoT, 5G/6G, An toàn mạng, Lập trình mạng...",
                                "Các nhà mạng viễn thông (Viettel, VNPT, MobiFone), Các cty sản xuất thiết bị điện tử",
                                "Viện Công nghệ TT&TT, Viện KHCN",
                                "Samsung, LG, Viettel, VNPT, FPT Telecom, Qualcomm, Intel",
                                "Kỹ sư thiết kế Vi mạch, Kỹ sư Vận hành mạng lưới, Kỹ sư IoT, Chuyên gia tối ưu hóa mạng vô tuyến",
                                "18-22 tr/năm", 25.68, 4.5, "Kỹ sư");
                dtvt.setSpecializations(
                                createSpecializations(
                                                Arrays.asList("Mạng và dịch vụ", "Thông tin vô tuyến và di động",
                                                                "Hệ thống IoT"),
                                                getPTIT_Telecom_Subjects()));
                majors.add(dtvt);

                // 4. Multimedia
                SchoolMajor multi = createDetailedMajor(schoolId + "_4", schoolId, "Công nghệ đa phương tiện",
                                "7329001",
                                "Ngành Công nghệ Đa phương tiện là sự giao thoa giữa Công nghệ thông tin và Mỹ thuật đa phương tiện. Sinh viên được trang bị kiến thức về thiết kế đồ họa 2D/3D, xử lý âm thanh/video, lập trình game, phát triển ứng dụng VR/AR, và thiết kế tương tác (UI/UX).",
                                140,
                                "Năm 2024: 200\nNăm 2023: 200",
                                "Năm 2024: 26.15\nNăm 2023: 25.8",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Mỹ thuật số, Thiết kế đồ họa, Kỹ xảo điện ảnh, Lập trình Game, Công nghệ thực tại ảo (VR/AR), Thiết kế Web/App...",
                                "Các đài truyền hình (VTV, VTC), Công ty truyền thông/quảng cáo, Studio Game, Công ty phần mềm",
                                "Viện Công nghệ TT&TT",
                                "VTV, VTC, VNG, Gameloft, FPT Software, các Agency quảng cáo",
                                "Chuyên viên thiết kế đồ họa (Designer), Lập trình viên Game, Chuyên gia kỹ xảo (VFX Artist), UI/UX Designer, Biên tập viên Video",
                                "15-25 tr/năm", 26.15, 4.5, "Cử nhân");
                multi.setSpecializations(
                                createSpecializations(
                                                Arrays.asList("Thiết kế đa phương tiện",
                                                                "Phát triển ứng dụng đa phương tiện"),
                                                getPTIT_Multimedia_Subjects()));
                majors.add(multi);

                // 5. Marketing
                SchoolMajor mkt = createDetailedMajor(schoolId + "_5", schoolId, "Marketing", "7340115",
                                "Ngành Marketing tại PTIT định hướng chuyên sâu về Digital Marketing trong kỷ nguyên số. Sinh viên được trang bị kiến thức về nghiên cứu thị trường, xây dựng thương hiệu, và triển khai các chiến dịch Marketing trên nền tảng công nghệ (SEO, SEM, Social Media, Content Marketing).",
                                128,
                                "Năm 2024: 220\nNăm 2023: 220",
                                "Năm 2024: 26.3\nNăm 2023: 25.85",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Marketing căn bản, Digital Marketing, Nghiên cứu thị trường, Quản trị thương hiệu, SEO, SEM, Phân tích dữ liệu Marketing...",
                                "Các Agency quảng cáo/truyền thông, Doanh nghiệp TMĐT, Các tập đoàn công nghệ, Đài truyền hình",
                                "Viện Kinh tế Bưu điện",
                                "VCCorp, VNG, FPT Online, Ogilvy, TBWA, các sàn TMĐT (Shopee, Lazada)",
                                "Chuyên viên Digital Marketing, Chuyên viên SEO/Content, Quản lý nhãn hàng (Brand Manager), Chuyên viên nghiên cứu thị trường, Account Executive",
                                "18-25 tr/năm", 26.3, 4.0, "Cử nhân");
                mkt.setSpecializations(
                                createSpecializations(Arrays.asList("Digital Marketing", "Truyền thông Marketing"),
                                                getPTIT_Marketing_Subjects()));
                majors.add(mkt);

                // 6. Khoa học máy tính (định hướng Khoa học dữ liệu)
                SchoolMajor cs = createDetailedMajor(schoolId + "_6", schoolId, "Khoa học máy tính", "7480101",
                                "Ngành Khoa học máy tính (định hướng Khoa học dữ liệu) đào tạo kỹ sư có năng lực về các lĩnh vực khoa học máy tính: Khoa học dữ liệu, Học máy và phát triển các hệ thống công nghệ thông tin. Chương trình đào tạo nhằm cung cấp cho sinh viên những kiến thức và kỹ năng cơ bản về Khoa học máy tính, đặc biệt là Khoa học dữ liệu và Học máy, giúp các em có khả năng tự học tập suốt đời và phát triển trong sự nghiệp công nghệ thông tin.",
                                150,
                                "Năm 2024: Chưa cập nhật\nNăm 2023: Chưa cập nhật",
                                "Năm 2024: Chưa cập nhật\nNăm 2023: 26.5",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Sinh viên sau khi tốt nghiệp ngành Khoa học máy tính (định hướng Khoa học dữ liệu) phù hợp với các vị trí việc làm sau:\n\n"
                                                +
                                                "- Có thể trở thành cán bộ kỹ thuật, quản lý, điều hành trong lĩnh vực khoa học máy tính;\n"
                                                +
                                                "- Có thể trở thành cán bộ lập trình, quản trị dữ liệu, chuyên viên về khoa học máy tính (đặc biệt theo chuyên ngành khoa học dữ liệu), tại các Viện, Trung tâm nghiên cứu và các cơ sở đào tạo;\n"
                                                +
                                                "- Có thể tiếp tục học tập tiếp lên trình độ sau đại học ở trong nước và nước ngoài.",
                                "Cục Công nghệ thông tin, Cục Viễn thông các Bộ, ngành",
                                "Viện Công nghệ thông tin, Viện Công nghệ phần mềm và nội dung số Việt Nam, Viện Nghiên cứu điện tử - tin học - tự động hóa, Viện Chiến lược thông tin và truyền thông, các Trung tâm nghiên cứu và các cơ sở đào tạo",
                                "Tập đoàn Bưu chính Viễn thông Việt Nam (VNPT), Tập đoàn Viễn thông quân đội (VIETEL), Tổng công ty Truyền thông đa phương tiện Việt Nam (VTC), Tổng công ty Viễn thông toàn cầu (GTEL), Tập đoàn FPT, Công ty Dịch vụ trực tuyến FPT (FPT Online), Công ty TNHH Phát triển phần mềm CMC, các công ty hoạt động trong lĩnh vực viễn thông, công nghệ thông tin",
                                "Sở Thông tin và truyền thông, Sở Khoa học và Công nghệ các tỉnh, thành phố",
                                "Học phí trình độ đại học hệ chính quy chương trình đại trà năm học 2022-2023 đối với ngành Khoa học máy tính (định hướng khoa học dữ liệu) là 665.000 đ/tín chỉ; Lộ trình tăng học phí tối đa cho từng năm: Mức học phí được điều chỉnh theo lộ trình phù hợp tương xứng với chất lượng đào tạo và đảm bảo tỷ lệ tăng không quá 15%/năm (theo Nghị định 81/2021/NĐ-CP của Chính phủ).",
                                26.5, 4, "Kỹ sư");

                // Thêm chuyên ngành Khoa học dữ liệu
                List<Specialization> csSpecs = new ArrayList<>();
                csSpecs.add(new Specialization("spec_cs_1", "Định hướng Khoa học dữ liệu", getPTIT_CS_Subjects()));
                cs.setSpecializations(csSpecs);

                majors.add(cs);

                // 7. AI
                SchoolMajor ai = createDetailedMajor(schoolId + "_7", schoolId, "Trí tuệ nhân tạo", "7480108",
                                "Chương trình đào tạo ngành Trí tuệ nhân tạo (TTNT) của Học viện Công nghệ Bưu chính Viễn thông được thiết kế nhằm đào tạo nhân lực trình độ Đại học (Kỹ sư) ngành Trí tuệ nhân tạo trong bối cảnh hội nhập quốc tế và chuyển đổi số. Sinh viên tốt nghiệp được trang bị các kỹ năng nghề nghiệp trong tương lai về Trí tuệ nhân tạo và Khoa học máy tính bao gồm cả chuyên môn, phẩm chất chính trị, đạo đức nghề nghiệp, và kỹ năng mềm.",
                                150,
                                "Năm 2024: Chưa cập nhật\nNăm 2023: Chưa cập nhật",
                                "Năm 2024: Chưa cập nhật\nNăm 2023: 26.3",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Nội dung đào tạo kết hợp giữa lý thuyết và thực tiễn, nhằm giúp học viên ứng dụng hiệu quả các kiến thức về Trí tuệ nhân tạo vào giải quyết các bài toán thực tế. Đồng thời, chương trình đào tạo ngành Trí tuệ nhân tạo nằm trong chiến lược phát triển của Học viện với triết lý giáo dục \"Tri thức – Sáng tạo – Đạo đức - Trách nhiệm\".",
                                "Bộ phận Research and Development (R&D) của các tổ chức",
                                "Viện Công nghệ thông tin, Viện khoa học và Công nghệ tính toán",
                                "VinAI, FPT.AI, Viettel AI, VNPT AI...",
                                "Kỹ sư xử lý ngôn ngữ tự nhiên (NLP Engineer), Kỹ sư Thị giác máy tính (CV Engineer), Chuyên viên phân tích dữ liệu (Data Analyst), Chuyên gia nghiên cứu về Trí tuệ nhân tạo (AI Research Scientist), Chuyên viên phát triển phần mềm Trí tuệ nhân tạo (AI Software Developer)",
                                "665.000 đ/tín chỉ (2022), tăng tối đa 15%/năm", 26.3, 4, "Kỹ sư");
                ai.setSpecializations(
                                createSpecializations(Arrays.asList("Trí tuệ nhân tạo"), getPTIT_AI_Subjects()));
                majors.add(ai);

                // 8. Báo chí
                SchoolMajor journalism = createDetailedMajor(schoolId + "_8", schoolId, "Báo chí", "7320101",
                                "Ngành Báo chí tại PTIT đào tạo theo định hướng công nghệ số (Digital Journalism). Sinh viên được trang bị kiến thức về báo chí đa phương tiện, báo chí dữ liệu, và ứng dụng công nghệ (AI, Big Data) trong sản xuất tin tức. Chương trình chú trọng kỹ năng thực hành tại các tòa soạn số mô phỏng.",
                                130,
                                "Năm 2024: 90\nNăm 2023: 100",
                                "Năm 2024: 26.5\nNăm 2023: 24.5",
                                "Văn – Sử – Địa (C00) hoặc Toán – Văn – Anh (D01)",
                                "Kiến thức về Lý luận báo chí, Báo chí đa phương tiện, Báo chí dữ liệu, Kỹ năng viết tin/bài, Sản xuất chương trình phát thanh/truyền hình, Đạo đức báo chí...",
                                "Các tòa soạn báo in/điện tử, Đài phát thanh - truyền hình, Các trang thông tin điện tử",
                                "Viện Công nghệ Thông tin và Truyền thông CDIT",
                                "VTV, VOV, VnExpress, Dân trí, VietnamPlus, các Sở TTTT",
                                "Phóng viên, Biên tập viên, Chuyên viên truyền thông, Chuyên viên nội dung số (Content Creator), Phân tích dữ liệu báo chí",
                                "15-20 tr/năm", 26.5, 4.0, "Cử nhân");
                journalism.setSpecializations(
                                createSpecializations(Arrays.asList("Báo chí đa phương tiện", "Báo chí dữ liệu"),
                                                getPTIT_Journalism_Subjects()));
                majors.add(journalism);

                // 9. QTKD
                SchoolMajor ba = createDetailedMajor(schoolId + "_9", schoolId, "Quản trị kinh doanh", "7340101",
                                "Chương trình Quản trị kinh doanh tại PTIT được thiết kế linh hoạt với các chuyên ngành hẹp: Quản trị Marketing, Thương mại điện tử, và Quản trị doanh nghiệp. Sinh viên được trang bị kiến thức hiện đại về quản trị kinh doanh trong bối cảnh chuyển đổi số, kỹ năng phân tích dữ liệu kinh doanh, và khởi nghiệp.",
                                130,
                                "Năm 2024: 260\nNăm 2023: 200",
                                "Năm 2024: 26.0\nNăm 2023: 25.2",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Quản trị học, Kinh tế lượng, Tài chính doanh nghiệp, Marketing căn bản, Thương mại điện tử, Quản trị chiến lược, Quản trị nguồn nhân lực, Khởi nghiệp...",
                                "Các doanh nghiệp sản xuất/dịch vụ, Ngân hàng, Công ty tài chính, Các công ty Startup",
                                "Viện Kinh tế Bưu điện",
                                "Viettel, VNPT, FPT, các Ngân hàng (MB, Techcombank), Shopee, Tiki",
                                "Chuyên viên kinh doanh (Sales), Chuyên viên Marketing, Chuyên viên Nhân sự (HR), Chuyên viên phân tích tài chính, Giám đốc điều hành (CEO - tương lai)",
                                "15-25 tr/năm", 26.0, 4.0, "Cử nhân");
                ba.setSpecializations(
                                createSpecializations(
                                                Arrays.asList("Quản trị doanh nghiệp", "Thương mại điện tử",
                                                                "Quản trị Marketing"),
                                                getPTIT_BusinessAdmin_Subjects()));
                majors.add(ba);

                // 10. Fintech
                // 10. Fintech
                // 10. Fintech
                SchoolMajor fintech = createDetailedMajor(schoolId + "_10", schoolId, "Công nghệ tài chính", "7340205",
                                "Chương trình đào tạo cử nhân Công nghệ Tài chính (Fintech) được thiết kế nhằm đào tạo nguồn nhân lực chất lượng cao, có kiến thức chuyên sâu về cả tài chính - ngân hàng và công nghệ thông tin. Sinh viên được trang bị năng lực áp dụng công nghệ số (Blockchain, AI, Big Data) để đổi mới, sáng tạo sản phẩm, dịch vụ tài chính.",
                                140,
                                "Năm 2024: 130\nNăm 2023: 120",
                                "Năm 2024: 25.61\nNăm 2023: 25.6",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về tài chính doanh nghiệp, ngân hàng số, phát triển ứng dụng Fintech, Blockchain, AI trong tài chính, An toàn bảo mật dữ liệu tài chính...",
                                "Ngân hàng Nhà nước, Bộ Tài chính, các Vụ/Cục liên quan",
                                "Viện Chiến lược Ngân hàng, Viện Kinh tế",
                                "MoMo, VNPAY, ZaloPay, Viettel Money, các Ngân hàng thương mại (Techcombank, MB, VPBank...)",
                                "Chuyên viên phân tích tài chính số, Phát triển sản phẩm Fintech, Quản trị rủi ro công nghệ, Chuyên viên Blockchain/AI tại ngân hàng",
                                "18-22 tr/năm", 25.61, 4, "Cử nhân");
                fintech.setSpecializations(
                                createSpecializations(Arrays.asList("Công nghệ tài chính"),
                                                getPTIT_Fintech_Subjects()));
                majors.add(fintech);

                // 14. Thương mại điện tử
                SchoolMajor ecom = createDetailedMajor(schoolId + "_14", schoolId, "Thương mại điện tử", "7340122",
                                "Ngành Thương mại điện tử tại PTIT kết hợp giữa Công nghệ thông tin và Kinh doanh số. Sinh viên được đào tạo để xây dựng và quản trị các hệ thống kinh doanh trực tuyến, thanh toán điện tử, và marketing số.",
                                130,
                                "Năm 2024: 150\nNăm 2023: 150",
                                "Năm 2024: 26.09\nNăm 2023: 25.9",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Quản trị TMĐT, Thanh toán điện tử, Digital Marketing, Thiết kế Web bán hàng, An toàn giao dịch điện tử, Logistics trong TMĐT...",
                                "Các sàn TMĐT lớn (Shopee, Lazada, Tiki), Doanh nghiệp Logistics, Các ngân hàng",
                                "Viện Kinh tế Bưu điện",
                                "Shopee, Lazada, Tiki, Grab, Gojek, Viettel Post",
                                "Chuyên viên quản trị sàn TMĐT, Chuyên viên Digital Marketing, Chuyên viên Logistics TMĐT, Business Analyst (BA) cho dự án TMĐT",
                                "15-22 tr/năm", 26.09, 4.0, "Cử nhân");
                ecom.setSpecializations(
                                createSpecializations(
                                                Arrays.asList("Quản trị TMĐT", "Marketing điện tử",
                                                                "Thanh toán điện tử"),
                                                getPTIT_Ecommerce_Subjects()));
                majors.add(ecom);

                // 15. Thiết kế và phát triển game
                SchoolMajor game = createDetailedMajor(schoolId + "_15", schoolId, "Thiết kế và phát triển Game",
                                "7480201",
                                "Đây là chương trình đào tạo chuyên sâu đầu tiên về Game tại Việt Nam (từ năm 2024). Sinh viên được trang bị kiến thức toàn diện từ lên ý tưởng, thiết kế kịch bản, thiết kế đồ họa (2D/3D) đến lập trình phát triển game trên các nềm tảng (Mobile, PC, Console) sử dụng các Game Engine phổ biến (Unity, Unreal).",
                                135,
                                "Năm 2024: 200\nNăm 2023: Chưa tuyển",
                                "Năm 2024: 26.0\nNăm 2023: N/A",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Kiến thức về Game Design, Lập trình Game (C#, C++), Đồ họa Game 2D/3D, Game Engine (Unity/Unreal), Trí tuệ nhân tạo trong Game, Kinh doanh và phát hành Game...",
                                "Các Studio Game (VNG, Gameloft, Funtap, VTC Game), Công ty phần mềm, Công ty thiết kế đồ họa",
                                "Viện Công nghệ Thông tin và Truyền thông CDIT",
                                "VNG, Gameloft, Ubisoft, Amanotes, OneSoft",
                                "Game Designer, Game Developer (Unity/Unreal), Game Artist (2D/3D), Level Designer, Game Producer",
                                "18-35 tr/năm", 26.0, 4.0, "Cử nhân");
                game.setSpecializations(
                                createSpecializations(
                                                Arrays.asList("Thiết kế Game (Game Design)",
                                                                "Lập trình Game (Game Development)"),
                                                getPTIT_GameDesign_Subjects()));
                majors.add(game);

                // 13. Công nghệ IoT
                SchoolMajor iot = createDetailedMajor(schoolId + "_13", schoolId, "Công nghệ Internet vạn vật (IoT)",
                                "7520208",
                                "Chương trình đào tạo kỹ sư IoT cung cấp kiến thức toàn diện về hệ thống nhúng, mạng cảm biến không dây, kết nối vạn vật, và phân tích dữ liệu IoT. Sinh viên có khả năng thiết kế, phát triển và triển khai các giải pháp IoT cho thành phố thông minh, nông nghiệp thông minh, và nhà máy thông minh.",
                                150,
                                "Năm 2024: 100\nNăm 2023: 100",
                                "Năm 2024: 25.5\nNăm 2023: 21.7",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Kiến thức về Mạch điện tử, Lập trình nhúng (C/C++), Vi điều khiển, Cảm biến, Mạng không dây (LoRa, Zigbee, NB-IoT), Cloud Computing, Big Data cho IoT...",
                                "Các tập đoàn công nghệ (Viettel, VNPT, FPT), Các công ty Smart Home, Các nhà máy sản xuất (Samsung, LG)",
                                "Viện Công nghệ Thông tin và Truyền thông CDIT",
                                "Viettel Networks, VNPT Technology, FPT Software, Rạng Đông, BKAV",
                                "Kỹ sư phát triển phần mềm nhúng (Embedded Software Engineer), Kỹ sư thiết kế phần cứng IoT, Kỹ sư giải pháp IoT, Chuyên viên quản trị hệ thống IoT",
                                "15-30 tr/năm", 25.5, 4.5, "Kỹ sư");
                iot.setSpecializations(
                                createSpecializations(Arrays.asList("Hệ thống nhúng", "Kết nối và Dịch vụ IoT"),
                                                getPTIT_IoT_Subjects()));
                majors.add(iot);

                // 11. Kế toán
                SchoolMajor acc = createDetailedMajor(schoolId + "_11", schoolId, "Kế toán", "7340301",
                                "Chương trình đào tạo Kế toán (theo định hướng kế toán số và chuẩn quốc tế) trang bị kiến thức chuyên sâu về Kế toán tài chính, Kế toán quản trị, Kiểm toán và Thuế. Đặc biệt, chương trình chú trọng ứng dụng CNTT trong kế toán (Kế toán máy, Hệ thống thông tin kế toán) và tiếp cận các chuẩn mực kế toán quốc tế (IAS/IFRS).",
                                130,
                                "Năm 2024: 150\nNăm 2023: 150",
                                "Năm 2024: 24.93\nNăm 2023: 24.8",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Sinh viên được trang bị kiến thức về Nguyên lý kế toán, Tài chính tiền tệ, Kế toán quản trị, Kiểm toán tài chính... cùng các kỹ năng sử dụng phần mềm kế toán, phân tích dữ liệu tài chính phục vụ ra quyết định kinh doanh.",
                                "Các Vụ/Cục Tài chính kế toán, Kiểm toán Nhà nước, Tổng cục Thuế",
                                "Các Viện nghiên cứu về Kinh tế, Tài chính",
                                "Big4 (Deloitte, PwC, EY, KPMG), các công ty Kiểm toán (AASC, A&C...), Tập đoàn đa quốc gia, Ngân hàng",
                                "Kế toán viên, Kiểm toán viên, Chuyên viên Tài chính, Chuyên viên Tư vấn Thuế, Kế toán trưởng",
                                "18-22 tr/năm", 24.93, 4, "Cử nhân");
                acc.setSpecializations(
                                createSpecializations(Arrays.asList("Kế toán doanh nghiệp"),
                                                getPTIT_Accounting_Subjects()));
                majors.add(acc);

                // 12. AIoT
                SchoolMajor aiot = createDetailedMajor(schoolId + "_12", schoolId, "Trí tuệ nhân tạo vạn vật (AIoT)",
                                "7480109",
                                "Mục tiêu của chương trình nhằm cung ứng nguồn nhân lực trình độ đại học trong lĩnh vực Trí tuệ nhân tạo vạn vật có bản lĩnh chính trị vững vàng, đạo đức nghề nghiệp; có kiến thức, kỹ năng sáng tạo và năng lực kỹ thuật số làm chủ công nghệ, phát triển mô hình AI trên nền tảng IoT trong bối cảnh công nghệ số liên tục thay đổi. Có khả năng khám phá lý thuyết nền tảng và thực hành chuyên sâu trong lĩnh vực Kỹ thuật điện tử viễn thông: có năng lực phân tích, thiết kế hệ thống, linh kiện và quy trình kỹ thuật trong lĩnh vực điện tử viễn thông, kết hợp kiến thức liên ngành về trí tuệ nhân tạo (AI) và Internet vạn vật (IoT); có năng lực tiến hành thí nghiệm, thu thập dữ liệu từ thiết bị IoT, phân tích và đánh giá hiệu quả của các giải pháp kỹ thuật thông qua phương pháp ứng dụng AI vào xử lý dữ liệu; có năng lực kỹ thuật số để chủ động làm việc với công nghệ và khả năng học tập, bám sát những thay đổi của công nghệ.",
                                150,
                                "Năm 2024: Chưa cập nhật\nNăm 2023: Chưa cập nhật",
                                "Năm 2024: Chưa cập nhật\nNăm 2023: 25.5",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Thông qua chương trình đào tạo, sinh viên sẽ khám phá cơ sở lý thuyết về lĩnh vực Internet vạn vật, trí tuệ nhân tạo, có kĩ năng cơ sở về khai phá dữ liệu và xử lý dữ liệu IoT và phát triển các mô hình trí tuệ nhân tạo ứng dụng trên các thiết bị IoT.",
                                "Giảng viên tại các cơ sở đào tạo",
                                "Cán bộ nghiên cứu tại các Viện, Trung tâm nghiên cứu",
                                "Viettel, VNPT, FPT, Samsung, LG...",
                                "Kiến trúc sư hệ thống AIoT, Kỹ sư xử lý dữ liệu AIoT, Kỹ sư an toàn thông tin AIoT, Kỹ sư phát triển sản phẩm AIoT",
                                "665.000 đ/tín chỉ (2022), tăng tối đa 15%/năm", 25.5, 4, "Kỹ sư");
                aiot.setSpecializations(
                                createSpecializations(Arrays.asList("Trí tuệ nhân tạo vạn vật"),
                                                getPTIT_AIoT_Subjects()));
                majors.add(aiot);

                // 18. Logistics
                SchoolMajor log = createDetailedMajor(schoolId + "_18", schoolId,
                                "Logistics và quản trị chuỗi cung ứng", "7340101",
                                "Đào tạo nhân lực chất lượng cao về Logistics và Quản trị chuỗi cung ứng trong môi trường số. Cung cấp kiến thức chuyên sâu về quản lý vận hành, hệ thống thông tin logistics, e-Logistics và tối ưu hóa chuỗi cung ứng toàn cầu.",
                                120,
                                "Năm 2024: 100\nNăm 2023: 100",
                                "Năm 2024: 25.5\nNăm 2023: N/A",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Quản trị Logistics, Chuỗi cung ứng, Vận tải đa phương thức, Kho hàng, Mua hàng, E-Logistics, Ứng dụng CNTT trong Logistics...",
                                "Cơ quan quản lý nhà nước (Bộ TT&TT, Bộ Công thương); Doanh nghiệp Bưu chính, Thương mại, Dịch vụ; Các Viện nghiên cứu, Cơ sở đào tạo",
                                "Viện Kinh tế Bưu điện",
                                "Viettel Post, VNPost, Lazada Logistics, Giao hàng tiết kiệm, Các công ty Logistics, Sàn TMĐT",
                                "Chuyên viên hoạch định chiến lược, Quản lý dự án logistics, Chuyên viên quản lý kho/vận tải, Giảng viên, Nghiên cứu viên, Nhà sáng lập doanh nghiệp Logistics",
                                "18-25 tr/năm", 25.5, 4, "Cử nhân");
                log.setSpecializations(createSpecializations(Arrays.asList("Logistics và quản trị chuỗi cung ứng"),
                                getPTIT_LogisticsSubjects()));
                majors.add(log);

                // 19. Quan hệ công chúng
                SchoolMajor pr = createDetailedMajor(schoolId + "_19", schoolId, "Quan hệ công chúng", "7340115_QHC",
                                "Chương trình đào tạo Quan hệ công chúng (Ngành Marketing) trang bị kiến thức chuyên sâu về truyền thông, quan hệ công chúng, marketing, xây dựng và quản trị thương hiệu. Sinh viên có khả năng lập kế hoạch, tổ chức sự kiện, xử lý khủng hoảng và sáng tạo nội dung đa phương tiện.",
                                80,
                                "Năm 2024: 80\nNăm 2023: N/A",
                                "Năm 2024: 25.15\nNăm 2023: N/A",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Nguyên lý QHCC, Tổ chức sự kiện, Quản trị khủng hoảng, Viết đa phương tiện, Truyền thông chính sách, Marketing số...",
                                "Các cơ quan nhà nước, Tổ chức phi chính phủ; Các doanh nghiệp, Tập đoàn đa quốc gia; Các Agency truyền thông, báo chí",
                                "Viện Kinh tế Bưu điện",
                                "VCCorp, VNG, Ogilvy, MVV Group, các Đài truyền hình, Các Bộ ban ngành",
                                "Chuyên viên quan hệ công chúng, Chuyên viên tổ chức sự kiện, Chuyên viên truyền thông nội bộ, Chuyên viên xử lý khủng hoảng, Nghiên cứu viên",
                                "15-20 tr/năm", 25.15, 4, "Cử nhân");
                pr.setSpecializations(createSpecializations(Arrays.asList("Quan hệ công chúng"),
                                getPTIT_PR_Subjects()));
                majors.add(pr);

                // 20. Kỹ thuật Điều khiển và tự động hóa
                SchoolMajor control = createDetailedMajor(schoolId + "_20", schoolId,
                                "Kỹ thuật Điều khiển và tự động hóa",
                                "7520216",
                                "Ngành Kỹ thuật Điều khiển và Tự động hóa (gồm có 2 chuyên ngành Điều khiển và tự động hóa, Rô bốt và Trí tuệ nhân tạo, không xét tuyển theo chuyên ngành, khi vào học sinh viên tự chọn chuyên ngành).",
                                80,
                                "Năm 2024: 80\nNăm 2023: 60",
                                "Năm 2024: 26.08\nNăm 2023: 25.40",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Kiến thức về Điều khiển tự động, Robot, Trí tuệ nhân tạo, Hệ thống IoT, Tự động hóa công nghiệp...",
                                "Lĩnh vực các cơ quan nhà nước; Lĩnh vực giáo dục và nghiên cứu; Lĩnh vực các doanh nghiệp; Lĩnh vực các nhà máy sản xuất",
                                "Khoa Kỹ thuật Điều khiển và Tự động hóa",
                                "Samsung, LG, VinFast, Viettel, VNPT, FPT",
                                "Kỹ sư nghiên cứu, Kỹ sư thiết kế, Kỹ sư bảo trì, Kỹ sư lập trình nhúng, Kỹ sư thiết kế Robot",
                                "15-30 tr/năm", 26.08, 4.5, "Kỹ sư");

                List<Specialization> controlSpecs = new ArrayList<>();
                controlSpecs.addAll(createSpecializations(Arrays.asList("Điều khiển và tự động hóa"),
                                getPTIT_ControlAutomation_Subjects()));
                controlSpecs.addAll(createSpecializations(Arrays.asList("Rô bốt và Trí tuệ nhân tạo"),
                                getPTIT_RobotAI_Subjects()));
                control.setSpecializations(controlSpecs);

                majors.add(control);

                // 16. Truyền thông đa phương tiện
                SchoolMajor multiComm = createDetailedMajor(schoolId + "_16", schoolId, "Truyền thông đa phương tiện",
                                "7320104",
                                "Ngành Truyền thông đa phương tiện (Multimedia Communication) hướng đến đào tạo nhân lực hội nhập quốc tế, trang bị kiến thức và kỹ năng truyền thông đa phương tiện. Sinh viên có khả năng đảm nhiệm các công việc như chuyên viên truyền thông, PR, quảng cáo, báo chí đa phương tiện, quản lý dự án truyền thông, thiết kế sản phẩm truyền thông số.",
                                140,
                                "Năm 2024: 140\nNăm 2023: 130",
                                "Năm 2024: 25.94\nNăm 2023: 26.33",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01) hoặc Toán - Văn - Anh (D01)",
                                "Kiến thức về Báo chí đa phương tiện, Truyền thông số, Quảng cáo, PR, Sản xuất Video/Podcast, Thiết kế đồ họa, Kịch bản đa phương tiện...",
                                "Các cơ quan thông tấn báo chí; Các công ty truyền thông, quảng cáo, PR; Các doanh nghiệp, tổ chức trong và ngoài nước; Các viện nghiên cứu, cơ sở đào tạo",
                                "Viện Công nghệ Thông tin và Truyền thông CDIT",
                                "VTV, VTC, VCCorp, VNG, Ogilvy, TBWA, Các đài phát thanh truyền hình địa phương",
                                "Chuyên viên truyền thông, Nhà báo đa phương tiện, Chuyên viên PR/Quảng cáo, Biên tập viên, Chuyên viên thiết kế, Quản lý dự án truyền thông",
                                "15-20 tr/năm", 25.94, 4, "Cử nhân");
                multiComm.setSpecializations(createSpecializations(Arrays.asList("Truyền thông đa phương tiện"),
                                getPTIT_MultimediaSubjects()));
                majors.add(multiComm);

                // 17. Công nghệ kỹ thuật Điện, điện tử
                SchoolMajor eee = createDetailedMajor(schoolId + "_17", schoolId, "Công nghệ kỹ thuật Điện, điện tử",
                                "7510301",
                                "Chuẩn bị nguồn nhân lực cho cuộc cách mạng công nghiệp 4.0, ngành đào tạo kỹ sư có kiến thức chuyên sâu về Điện tử, Viễn thông, Tự động hóa và Thiết kế vi mạch. Sinh viên có khả năng thiết kế, chế tạo, vận hành các thiết bị điện tử, hệ thống viễn thông, robot và các giải pháp IoT.",
                                100,
                                "Năm 2024: 100\nNăm 2023: 100",
                                "Năm 2024: 25.0\nNăm 2023: 24.5",
                                "Toán – Lý – Hóa (A00) hoặc Toán – Lý – Anh (A01)",
                                "Kiến thức về Mạch điện tử, Xử lý tín hiệu, Kỹ thuật vi xử lý, Thiết kế vi mạch, Hệ thống nhúng, Robot, IoT...",
                                "Các tập đoàn công nghệ (Viettel, VNPT, Samsung, LG, FPT, Intel, Renesas); Các nhà máy sản xuất thiết bị điện tử; Các viện nghiên cứu",
                                "Khoa Kỹ thuật Điện tử 1",
                                "Samsung, LG, Foxconn, Intel, Viettel High Tech, VNPT Technology",
                                "Kỹ sư thiết kế vi mạch, Kỹ sư hệ thống nhúng, Kỹ sư thiết kế phần cứng, Kỹ sư IoT, Chuyên viên kỹ thuật điện tử",
                                "15-25 tr/năm", 25.0, 4.5, "Kỹ sư");
                eee.setSpecializations(createSpecializations(
                                Arrays.asList("Xử lý tín hiệu truyền thông", "Điện tử máy tính",
                                                "Kỹ thuật Robot", "Thiết kế vi mạch"),
                                getPTIT_EEE_Subjects()));
                majors.add(eee);
        }

        private static List<Specialization> createSpecializations(List<String> names, List<Subject> subjects) {
                List<Specialization> list = new ArrayList<>();
                int i = 1;
                for (String name : names) {
                        list.add(new Specialization("spec_" + i++, name, subjects));
                }
                return list;
        }

        // Chương trình Global ICT (IT-E7) - 10 Học kỳ
        private static List<Subject> getITSubjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("IT1110", "Tin học đại cương", 4, 1));
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("FL1129", "Introduction to ICT 1", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 2));
                subjects.add(new Subject("IT3011", "Cấu trúc dữ liệu và giải thuật", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("IT3020", "Toán rời rạc", 3, 3));
                subjects.add(new Subject("IT3040", "Kỹ thuật lập trình", 3, 3));
                subjects.add(new Subject("IT3070", "Nguyên lý hệ điều hành", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("IT3080", "Mạng máy tính", 3, 4));
                subjects.add(new Subject("IT3090", "Cơ sở dữ liệu", 3, 4));
                subjects.add(new Subject("IT3100", "Lập trình hướng đối tượng", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("IT3120", "Phân tích và thiết kế hệ thống", 3, 5));
                subjects.add(new Subject("IT4010", "An toàn thông tin", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("IT4020", "Nhập môn Trí tuệ nhân tạo", 3, 6));
                subjects.add(new Subject("IT4060", "Lập trình mạng", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("IT4440", "Tương tác người máy", 3, 7));
                subjects.add(new Subject("IT4490", "Thiết kế và xây dựng phần mềm", 3, 7));
                subjects.add(new Subject("IT4501", "Hệ quản trị cơ sở dữ liệu", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("IT4991", "Thực tập kỹ thuật", 2, 8));
                subjects.add(new Subject("IT4409", "Công nghệ Web tiên tiến", 3, 8));
                // Kỳ 9
                subjects.add(new Subject("IT5000", "Đồ án tốt nghiệp Cử nhân", 6, 9));
                // Kỳ 10
                subjects.add(new Subject("IT5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
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
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("ME2011", "Cơ học kỹ thuật I", 3, 2));
                subjects.add(new Subject("ME2202", "Nguyên lý máy", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ME3011", "Chi tiết máy", 3, 3));
                subjects.add(new Subject("ME3201", "Dung sai và kỹ thuật đo", 2, 3));
                subjects.add(new Subject("ME2013", "Sức bền vật liệu", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ME3101", "Công nghệ chế tạo máy", 4, 4));
                subjects.add(new Subject("ME3102", "Đồ án Công nghệ chế tạo máy", 2, 4));
                subjects.add(new Subject("ME3402", "Ma sát học", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ME4001", "Vật liệu học cơ khí", 3, 5));
                subjects.add(new Subject("ME4101", "CAD/CAM/CNC", 3, 5));
                subjects.add(new Subject("ME3213", "Kỹ thuật vi xử lý trong cơ khí", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("ME4201", "Thủy lực và Khí nén", 3, 6));
                subjects.add(new Subject("ME4301", "Máy điều khiển số", 3, 6));
                subjects.add(new Subject("ME4220", "Hệ thống cơ điện tử", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("ME4401", "Thiết kế máy", 3, 7));
                subjects.add(new Subject("ME4501", "Robot công nghiệp", 3, 7));
                subjects.add(new Subject("ME4460", "Kỹ thuật đo lường chính xác", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("ME4991", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("ME4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("ME5200", "Mô hình hóa và mô phỏng hệ thống", 3, 9));
                subjects.add(new Subject("ME5210", "Dụng cụ cắt công nghiệp", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("ME5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
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
                        String tuitionFee, double benchmarkScore, double duration, String degree) {
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

        private static List<Subject> getPTIT_IS_Subjects() {
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
                                // Note: Image 2 for Sem 6 has "Nhập môn công nghệ phần mềm", "Nhập môn trí tuệ
                                // nhân tạo",
                                // "An toàn và bảo mật HTTT", "Lập trình web". The image doesn't show "Cơ sở dữ
                                // liệu phân tán" or "Thực tập cơ sở".
                                // Wait, looking at Image 2 for IS:
                                // Sem 6: Nhập môn CNPM (3), Nhập môn TTNT (3), AT&BM HTTT (3), Lập trình web
                                // (3). That's 4 subjects.
                                // Wait, there might be more. Let me double check Image 2 carefully.
                                // Image 2 Sem 6:
                                // Row 1: Nhập môn CNPM, Nhập môn Trí tuệ nhân tạo, AT&BM HTTT, Lập trình web.
                                // Row 2: (Empty/Cut off?) No, it seems that's all for visible subjects in Sem 6
                                // of IS in this view?
                                // Actually, looking at the crop, it seems complete.
                                // BUT, looking at the *previous* generic IT list (getPTITITSubjects) which was
                                // based on the first request (likely Network specialization),
                                // it had Distributed DB and Internship.
                                // Let's look at Image 3 (Sem 7-9).
                                // Sem 7: Xử lý ảnh, Phân tích & thiết kế HTTT, Quản lý dự án phần mềm, IoT và
                                // ứng dụng.
                                // Sem 7 Row 2: Học phần tự chọn (6 tín).
                                // Sem 8: Phát triển hệ thống TMĐT, Các hệ thống phân tán, Xây dựng các hệ thống
                                // nhúng, Kho dữ liệu và khai phá dữ liệu.
                                // Sem 8 Row 2: Học phần tự chọn (3), PP luận NCKH (2).
                                // Sem 9: Thực tập và tốt nghiệp (12).
                                //
                                // Wait, I missed "Thực tập cơ sở" in Sem 6. Is it there?
                                // Unlike the first request, I don't see "Thực tập cơ sở" in Sem 6 for IS in
                                // these specific images.
                                // However, usually there is one. But I must stick to the images provided by the
                                // user.
                                // If it's not in the image, I won't add it, or I'll add it if it's standard.
                                // Let's stick strictly to the images.

                                // Hoc ky 6 (Revised based on Image 2)
                                // Nhập môn CNPM, Nhập môn TTNT, AT&BM HTTT, Lập trình web.
                                // (Checked again) The image 2 ends at "Lập trình web".

                                // Hoc ky 7
                                new Subject("Xử lý ảnh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế HTTT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Quản lý dự án phần mềm", 3, 7, "CHUYEN_NGANH"),
                                new Subject("IoT và ứng dụng", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 6, 7, "CHUYEN_NGANH"),

                                // Hoc ky 8
                                new Subject("Phát triển hệ thống TMĐT", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Các hệ thống phân tán", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Xây dựng các hệ thống nhúng", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Kho dữ liệu và khai phá dữ liệu", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phương pháp luận nghiên cứu khoa học", 2, 8, "KY_NANG"),

                                // Hoc ky 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        private static List<Subject> getPTIT_SE_Subjects() {
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
                                new Subject("Vật lý ứng dụng", 4, 2, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật số", 2, 2, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 2, "BO_TRO"),

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
                                new Subject("Thực tập cơ sở", 3, 6, "THUC_TAP"),

                                // Hoc ky 7
                                new Subject("QLDA phần mềm", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế HTTT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Xử lý ảnh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phát triển các hệ thống thông minh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 6, 7, "CHUYEN_NGANH"),

                                // Hoc ky 8
                                new Subject("PTƯD cho thiết bị di động", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Đảm bảo chất lượng phần mềm", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phát triển yêu cầu phần mềm", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Kiến trúc và thiết kế phần mềm", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phương pháp luận nghiên cứu khoa học", 2, 8, "KY_NANG"),
                                new Subject("Học phần tự chọn", 3, 8, "CHUYEN_NGANH"),

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

        // Chương trình đào tạo Khoa học máy tính PTIT (định hướng Khoa học dữ liệu)
        private static List<Subject> getPTIT_CS_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "BAT_BUOC_CHUNG"),
                                new Subject("Tin học cơ sở 1", 2, 1, "BO_TRO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "BAT_BUOC_CHUNG_NGANH"),
                                new Subject("Đại số", 3, 1, "BAT_BUOC_CHUNG_NGANH"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "BAT_BUOC_CHUNG"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "BAT_BUOC_CHUNG_NGANH"),
                                new Subject("Tin học cơ sở 2", 2, 2, "BO_TRO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "BAT_BUOC_CHUNG_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "BAT_BUOC_CHUNG"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "BAT_BUOC_CHUNG_NGANH"),
                                new Subject("Vật lý và Thí nghiệm", 4, 3, "BO_TRO_NGANH"),
                                new Subject("Kỹ thuật số", 2, 3, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 2, 3, "BO_TRO_NGANH"),
                                new Subject("Ngôn ngữ lập trình C++", 3, 3, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc 1", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "BAT_BUOC_CHUNG"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "BAT_BUOC_CHUNG_NGANH"),
                                new Subject("Kiến trúc máy tính", 3, 4, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc 2", 3, 4, "CO_SO_NGANH"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 4, "CO_SO_NGANH"),
                                new Subject("Lý thuyết thông tin", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "BAT_BUOC_CHUNG"),
                                new Subject("Tiếng Anh (Course 3 Plus)", 4, 5, "BAT_BUOC_CHUNG_NGANH"),
                                new Subject("Hệ điều hành", 3, 5, "CO_SO_NGANH"),
                                new Subject("Lập trình hướng đối tượng", 3, 5, "CO_SO_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 5, "CO_SO_NGANH"),
                                new Subject("Mạng máy tính", 3, 5, "CO_SO_NGANH"),
                                new Subject("Lập trình Python", 3, 5, "CO_SO_NGANH"),

                                // Học kỳ 6
                                new Subject("Nhập môn trí tuệ nhân tạo", 3, 6, "CO_SO_NGANH"),
                                new Subject("An toàn và bảo mật hệ thống thông tin", 3, 6, "CO_SO_NGANH"),
                                new Subject("Nhập môn công nghệ phần mềm", 3, 6, "CO_SO_NGANH"),
                                new Subject("Lập trình web", 3, 6, "CO_SO_NGANH"),
                                new Subject("Hệ quản trị cơ sở dữ liệu", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thực tập cơ sở", 3, 6, "THUC_TAP"),

                                // Học kỳ 7
                                new Subject("Phương pháp luận nghiên cứu khoa học", 2, 7, "BO_TRO_NGANH"),
                                new Subject("Xử lý ảnh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học máy", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế hệ thống thông tin", 3, 7, "CO_SO_NGANH"),
                                new Subject("Nhập học khoa học dữ liệu", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 3, 7, "GDCN"),

                                // Học kỳ 8
                                new Subject("Nhập môn học sâu", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Khai phá dữ liệu lớn", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 3, 8, "GDCN"),
                                new Subject("Học phần tự chọn", 3, 8, "GDCN"),
                                new Subject("Học phần tự chọn", 3, 8, "GDCN"),
                                new Subject("Học phần tự chọn", 3, 8, "GDCN"),

                                // Học kỳ 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        // Chương trình đào tạo Công nghệ tài chính PTIT (8 học kỳ)
        private static List<Subject> getPTIT_Fintech_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Toán cao cấp 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Nguyên lý kế toán", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 2, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Tin học cơ sở 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 2, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Tài chính tiền tệ", 3, 2, "CO_SO_NGANH"),
                                new Subject("Kế toán quản trị", 3, 2, "CO_SO_NGANH"),

                                // Học kỳ 3
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Xác suất thống kê", 3, 3, "CO_SO_NGANH"),
                                new Subject("Lập trình Python", 3, 3, "COT_LOI"),
                                new Subject("Tài chính doanh nghiệp", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Thanh toán quốc tế", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),

                                // Học kỳ 4
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Công nghệ tài chính căn bản", 3, 4, "COT_LOI"),
                                new Subject("Phân tích nghiệp vụ kinh doanh", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Luật kinh doanh", 2, 4, "BO_TRO"),
                                new Subject("Lập trình Web", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 4, "COT_LOI"),
                                new Subject("Học phần tự chọn", 3, 4, "CHUYEN_NGANH"),

                                // Học kỳ 5
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 5, "COT_LOI"),
                                new Subject("Đầu tư tài chính", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Phân tích và thiết kế HTTT", 3, 5, "CO_SO_NGANH"),
                                new Subject("Phân tích tài chính", 3, 5, "CHUYEN_NGANH"),
                                new Subject("An toàn và bảo mật thông tin", 3, 5, "COT_LOI"),
                                new Subject("Học phần tự chọn", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Nghiệp vụ ngân hàng", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Công nghệ Blockchain", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Tài chính hành vi", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Kinh tế lượng tài chính", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Đề án Công nghệ tài chính", 3, 6, "THUC_TAP"),
                                new Subject("Học phần tự chọn", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Trí tuệ nhân tạo trong tài chính", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Quản trị rủi ro tài chính", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Dữ liệu lớn trong tài chính", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập tốt nghiệp", 4, 7, "THUC_TAP"),
                                new Subject("Học phần tự chọn", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo Kỹ thuật Điện tử viễn thông PTIT (9 học kỳ)
        private static List<Subject> getPTIT_Telecom_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Đại số", 3, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Tin học cơ sở 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Vật lý 1", 3, 2, "CO_SO_NGANH"), // Added Physics implied for engineering
                                new Subject("Vật lý 2", 3, 2, "CO_SO_NGANH"), // Added Physics based on standard
                                                                              // curriculum if missing in extraction

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Lý thuyết mạch", 3, 3, "CO_SO_NGANH"),
                                new Subject("Linh kiện và mạch điện tử", 3, 3, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Xử lý tín hiệu số", 3, 4, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật siêu cao tần", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Điện tử số", 3, 4, "CO_SO_NGANH"),
                                new Subject("Lý thuyết truyền tin", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Tiếng Anh (Course 3 Plus)", 2, 5, "KY_NANG"),
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Truyền sóng và anten", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Toán rời rạc", 3, 5, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật lập trình", 3, 5, "COT_LOI"),
                                new Subject("Kiến trúc máy tính", 3, 5, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật vi xử lý", 3, 5, "CO_SO_NGANH"),

                                // Học kỳ 6
                                new Subject("Hệ điều hành", 2, 6, "COT_LOI"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 6, "COT_LOI"),
                                new Subject("Kỹ thuật thông tin quang", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Kỹ thuật mạng truyền thông", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Kỹ thuật thông tin vô tuyến", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Công nghệ phần mềm", 3, 6, "COT_LOI"),
                                new Subject("Mô phỏng hệ thống truyền thông", 2, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Phương pháp luận NCKH", 2, 7, "BO_TRO"),
                                new Subject("Internet và các giao thức", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Mạng truyền thông và quang", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thông tin di động", 3, 7, "CHUYEN_NGANH"),
                                new Subject("An toàn mạng thông tin", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 7, "CO_SO_NGANH"),

                                // Học kỳ 8
                                new Subject("Điện toán và đám mây", 2, 8, "CHUYEN_NGANH"),
                                new Subject("Lập trình hướng đối tượng", 3, 8, "COT_LOI"),
                                new Subject("Chuyên đề mạng và Internet", 1, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 2, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 2", 2, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 3", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 4", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 5", 3, 8, "CHUYEN_NGANH"),

                                // Học kỳ 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        // Chương trình đào tạo Kế toán PTIT (8 học kỳ)
        private static List<Subject> getPTIT_Accounting_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("NNLCB CN Mác-Lênin 1 (Triết học)", 2, 1, "COT_LOI"),
                                new Subject("Kinh tế vi mô 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("NNLCB CN Mác-Lênin 2 (KTCT)", 3, 2, "COT_LOI"),
                                new Subject("Tiếng Anh A11/A21", 3, 2, "KY_NANG"),
                                new Subject("Toán cao cấp 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Lý thuyết xác suất và thống kê", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tin học cơ sở 3", 3, 2, "CO_SO_NGANH"),
                                new Subject("Kinh tế vĩ mô 1", 3, 2, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 2", 0, 2, "COT_LOI"),

                                // Học kỳ 3
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh A12/A22", 4, 3, "KY_NANG"),
                                new Subject("Toán kinh tế", 3, 3, "CO_SO_NGANH"),
                                new Subject("Nguyên lý kế toán", 3, 3, "CO_SO_NGANH"),
                                new Subject("Marketing căn bản", 3, 3, "CO_SO_NGANH"),
                                new Subject("Quản trị học", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Đường lối cách mạng ĐCSVN", 3, 4, "COT_LOI"),
                                new Subject("Tiếng Anh A21/B11", 3, 4, "KY_NANG"),
                                new Subject("Kế toán quản trị 1", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Kế toán tài chính 1", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Tài chính tiền tệ", 3, 4, "CO_SO_NGANH"),
                                new Subject("Luật kinh doanh", 4, 4, "BO_TRO"),
                                new Subject("Quản trị tài chính doanh nghiệp", 3, 4, "CHUYEN_NGANH"),

                                // Học kỳ 5
                                new Subject("Tiếng Anh A22/ B12", 4, 5, "KY_NANG"),
                                new Subject("Thanh toán quốc tế", 2, 5, "CHUYEN_NGANH"),
                                new Subject("Kiểm toán căn bản", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kế toán tài chính 2", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kế toán quản trị 2", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Hệ thống thông tin kế toán", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Nguyên lý thống kê kinh tế", 3, 6, "CO_SO_NGANH"),
                                new Subject("ACCA", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thuế và kế toán thuế", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Phân tích báo cáo tài chính DN", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Kế toán tài chính 3", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 2", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 3", 2, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Phương pháp luận NCKH", 2, 7, "BO_TRO"),
                                new Subject("Phân tích hoạt động kinh doanh", 2, 7, "CHUYEN_NGANH"),
                                new Subject("CFA", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Kế toán máy", 2, 7, "CHUYEN_NGANH"),
                                new Subject("Kiểm toán tài chính", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 4", 2, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 5", 2, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 6", 2, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập và tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo Trí tuệ nhân tạo vạn vật PTIT
        private static List<Subject> getPTIT_AIoT_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Tiếng Anh Course 0", 4, 1, "COT_LOI"),
                                new Subject("Đại số", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn Lập trình với Python", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 2, 1, "COT_LOI"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Tiếng Anh Course 1", 4, 2, "KY_NANG"),
                                new Subject("Vật lý 1 và thí nghiệm", 4, 2, "CO_SO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 2, 2, "CO_SO_NGANH"),
                                new Subject("Nhập môn trí tuệ nhân tạo vạn vật", 2, 2, "CO_SO_NGANH"),
                                new Subject("Triết học Mác- Lênin", 3, 2, "COT_LOI"),
                                new Subject("Giáo dục thể chất 2", 2, 2, "COT_LOI"),

                                // Học kỳ 3
                                new Subject("Tiếng Anh Course 2", 4, 3, "KY_NANG"),
                                new Subject("Vật lý 2 và thí nghiệm", 4, 3, "CO_SO_NGANH"),
                                new Subject("Linh kiện và mạch điện tử", 3, 3, "CO_SO_NGANH"),
                                new Subject("Lập trình Web", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Tín hiệu và hệ thống", 3, 3, "CO_SO_NGANH"),
                                new Subject("Kinh tế chính trị Mác - Lênin", 2, 3, "COT_LOI"),
                                new Subject("Kiến trúc máy tính", 2, 3, "CO_SO_NGANH"),
                                new Subject("Môn kỹ năng mềm 1", 1, 3, "KY_NANG"),

                                // Học kỳ 4
                                new Subject("Tiếng Anh Course 3", 4, 4, "KY_NANG"),
                                new Subject("Nhập môn học máy", 3, 4, "COT_LOI"),
                                new Subject("Xử lý tín hiệu số", 3, 4, "CO_SO_NGANH"),
                                new Subject("Hệ điều hành", 2, 4, "CO_SO_NGANH"),
                                new Subject("Điện tử số", 3, 4, "CO_SO_NGANH"),
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 4, "COT_LOI"),
                                new Subject("Môn kỹ năng mềm 2", 1, 4, "KY_NANG"),

                                // Học kỳ 5
                                new Subject("Tiếng Anh Course 3 (Plus)", 2, 5, "KY_NANG"),
                                new Subject("Nhập môn công nghệ phần mềm", 3, 5, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc", 3, 5, "CO_SO_NGANH"),
                                new Subject("Cơ sở an toàn thông tin", 3, 5, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật mạng và truyền thông", 3, 5, "CO_SO_NGANH"),
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 5, "COT_LOI"),
                                new Subject("Kiến trúc và giao thức IoT", 2, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Thực tập cơ sở", 2, 6, "THUC_TAP"),
                                new Subject("Mạng cảm biến thông minh", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Nhập môn phân tích dữ liệu", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Nhập môn DevOps", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Hệ quản trị cơ sở dữ liệu và ứng dụng", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Lịch sử Đảng cộng sản Việt Nam", 2, 6, "COT_LOI"),
                                new Subject("Học phần tự chọn 1 (*)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Môn kỹ năng mềm 3", 1, 6, "KY_NANG"),

                                // Học kỳ 7
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phát triển ứng dụng trí tuệ nhân tạo", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học sâu và ứng dụng trong IoT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Hệ quản trị cơ sở dữ liệu nâng cao", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phát triển ứng dụng IoT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("An toàn Internet of Things", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Học phần tự chọn 3", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 4", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Đổi mới và sáng tạo khởi nghiệp", 3, 8, "KY_NANG"),
                                new Subject("Điện toán đám mây", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Mô hình ngôn ngữ lớn", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Công nghệ phân tích dữ liệu lớn", 3, 8, "CHUYEN_NGANH"),

                                // Học kỳ 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        // Chương trình đào tạo Trí tuệ nhân tạo PTIT
        private static List<Subject> getPTIT_AI_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Đại số", 3, 1, "CO_SO_NGANH"),
                                new Subject("Lập trình Python cơ bản", 3, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Vật lý ứng dụng", 4, 2, "CO_SO_NGANH"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 3, 2, "CO_SO_NGANH"),

                                // Học kỳ 3
                                new Subject("Phương pháp lập trình cơ bản", 3, 3, "COT_LOI"),
                                new Subject("Cơ sở dữ liệu", 3, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Toán rời rạc 1", 3, 3, "CO_SO_NGANH"),
                                new Subject("Khoa học dữ liệu cơ bản", 3, 3, "COT_LOI"),
                                new Subject("Điện tử số", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 4, "COT_LOI"),
                                new Subject("Nền tảng phát triển trí tuệ nhân tạo", 3, 4, "COT_LOI"),
                                new Subject("Triết học Mác-Lênin", 3, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Kiến trúc máy tính", 3, 4, "CO_SO_NGANH"),
                                new Subject("Lý thuyết đồ thị", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Trí tuệ nhân tạo cơ bản", 3, 5, "COT_LOI"),
                                new Subject("Lập trình hướng đối tượng", 3, 5, "COT_LOI"),
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 5, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3 Plus)", 2, 5, "KY_NANG"),
                                new Subject("Xử lý ảnh", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Lập trình web", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Mạng máy tính", 3, 6, "COT_LOI"),
                                new Subject("Nhập môn Học máy", 3, 6, "COT_LOI"),
                                new Subject("Xử lý ngôn ngữ tự nhiên", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 6, "COT_LOI"),
                                new Subject("Nhập môn công nghệ phần mềm", 3, 6, "COT_LOI"),
                                new Subject("Đạo đức và chính sách TTNT", 3, 6, "BO_TRO"),
                                new Subject("Nhập môn Học sâu", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Học phần tự chọn", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập cơ sở", 4, 7, "THUC_TAP"),
                                new Subject("Pháp luật luận NCKH", 2, 7, "BO_TRO"),
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 7, "COT_LOI"),
                                new Subject("Mô hình ngôn ngữ lớn", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thị giác máy tính", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Trí tuệ nhân tạo cho an toàn bảo mật TT", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Công cụ triển khai và vận hành ứng dụng TTNT", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Lịch sử Đảng Cộng sản VN", 2, 8, "COT_LOI"),
                                new Subject("Học tăng cường và ứng dụng", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Truy xuất thông tin", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phát triển ứng dụng TTNT", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn", 6, 8, "CHUYEN_NGANH"),

                                // Học kỳ 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        // Chương trình đào tạo Công nghệ Đa phương tiện PTIT (9 học kỳ)
        private static List<Subject> getPTIT_Multimedia_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Cơ sở tạo hình", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp 1 (Giải tích 1)", 2, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn Đa phương tiện", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Tin học cơ sở 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp 2", 2, 2, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật nhiếp ảnh", 2, 2, "CHUYEN_NGANH"),
                                new Subject("Mỹ thuật cơ bản", 3, 2, "CO_SO_NGANH"),
                                new Subject("Thiết kế đồ họa", 2, 2, "CHUYEN_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Toán rời rạc 1", 3, 3, "CO_SO_NGANH"),
                                new Subject("Xác suất thống kê", 2, 3, "CO_SO_NGANH"),
                                new Subject("Thiết kế hình động 1", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Ngôn ngữ lập trình C++", 3, 3, "COT_LOI"),
                                new Subject("Kỹ thuật quay phim", 3, 3, "CHUYEN_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Pháp luật đại cương", 2, 4, "BO_TRO"),
                                new Subject("Thiết kế tương tác đa phương tiện", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thiết kế đồ họa 3D", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Xử lý và truyền thông ĐPT", 2, 4, "CO_SO_NGANH"),
                                new Subject("Tổ chức sản xuất sản phẩm ĐPT", 2, 4, "CHUYEN_NGANH"),
                                new Subject("Dựng audio và video phi tuyến", 3, 4, "CHUYEN_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3 Plus)", 2, 5, "KY_NANG"),
                                new Subject("Thiết kế Web cơ bản", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kịch bản đa phương tiện", 2, 5, "CHUYEN_NGANH"),
                                new Subject("Kỹ xảo đa phương tiện", 2, 5, "CHUYEN_NGANH"),
                                new Subject("Bản quyền số", 2, 5, "BO_TRO"),
                                new Subject("Nhập môn công nghệ phần mềm", 3, 5, "COT_LOI"),
                                new Subject("Học phần tự chọn 1", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Cơ sở dữ liệu", 3, 6, "COT_LOI"),
                                new Subject("Kiến trúc máy tính và HĐH", 2, 6, "COT_LOI"),
                                new Subject("Kỹ thuật đồ họa", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Phương pháp luận NCKH", 2, 6, "BO_TRO"),
                                new Subject("Lập trình âm thanh", 2, 6, "CHUYEN_NGANH"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 6, "COT_LOI"),
                                new Subject("Học phần tự chọn 2", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Chuyên đề Phát triển ứng dụng ĐPT", 1, 7, "CHUYEN_NGANH"),
                                new Subject("Lập trình Web", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Lập trình ƯD trên đầu cuối di động", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Lập trình Game cơ bản", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Xử lý ảnh và video", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 3", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Kiểm thử và đảm bảo chất lượng PM", 3, 8, "COT_LOI"),
                                new Subject("Khai phá dữ liệu ĐPT", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Phát triển ứng dụng thực tại ảo", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 4", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Thực hành chuyên sâu", 4, 8, "THUC_TAP"),

                                // Học kỳ 9
                                new Subject("Thực tập và tốt nghiệp", 12, 9, "DO_AN"));
        }

        // Chương trình đào tạo Marketing PTIT (8 học kỳ) - Representative
        private static List<Subject> getPTIT_Marketing_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp cho kinh tế", 3, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Nhập môn Marketing", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Kinh tế vi mô", 3, 2, "CO_SO_NGANH"),
                                new Subject("Kinh tế vĩ mô", 3, 2, "CO_SO_NGANH"),
                                new Subject("Marketing căn bản", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tâm lý học khách hàng", 2, 2, "CHUYEN_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Nguyên lý kế toán", 3, 3, "CO_SO_NGANH"),
                                new Subject("Quản trị học", 3, 3, "CO_SO_NGANH"),
                                new Subject("Nghiên cứu Marketing", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Hành vi người tiêu dùng", 3, 3, "CHUYEN_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Digital Marketing căn bản", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thương mại điện tử", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Luật kinh tế", 3, 4, "BO_TRO"),
                                new Subject("Thống kê kinh doanh", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Quản trị thương hiệu", 3, 5, "CHUYEN_NGANH"),
                                new Subject("SEO & SEM", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Content Marketing", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Marketing dịch vụ", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kỹ năng mềm", 2, 5, "KY_NANG"),

                                // Học kỳ 6
                                new Subject("Marketing truyền thông xã hội (Social Media)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Quan hệ công chúng (PR)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Phân tích dữ liệu Marketing", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Đạo đức kinh doanh", 2, 6, "BO_TRO"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Quản trị bán hàng", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Marketing quốc tế", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Chiến lược Marketing", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Chuyên đề Digital Marketing", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập tốt nghiệp", 4, 8, "THUC_TAP"),
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo Báo chí PTIT (8 học kỳ) - Representative (Digital
        // Journalism Focus)
        private static List<Subject> getPTIT_Journalism_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở", 3, 1, "CO_SO_NGANH"),
                                new Subject("Cơ sở văn hóa Việt Nam", 3, 1, "COT_LOI"),
                                new Subject("Tiếng Việt thực hành", 2, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn Báo chí truyền thông", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Xã hội học đại cương", 3, 2, "COT_LOI"),
                                new Subject("Cơ sở lý luận báo chí", 3, 2, "CO_SO_NGANH"),
                                new Subject("Lịch sử báo chí", 2, 2, "CO_SO_NGANH"),
                                new Subject("Pháp luật và Đạo đức báo chí", 3, 2, "CO_SO_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Tâm lý học báo chí", 2, 3, "CO_SO_NGANH"),
                                new Subject("Ngôn ngữ báo chí", 3, 3, "CO_SO_NGANH"),
                                new Subject("Kỹ năng phỏng vấn", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Kỹ năng nhiếp ảnh báo chí", 3, 3, "CHUYEN_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Tác phẩm báo chí đa phương tiện", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Biên tập báo chí", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Báo chí dữ liệu (Data Journalism)", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thiết kế đồ họa báo chí", 3, 4, "CHUYEN_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Tổ chức tòa soạn hội tụ", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Sản xuất chương trình Phát thanh", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Sản xuất chương trình Truyền hình", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Truyền thông xã hội", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kỹ năng mềm", 2, 5, "KY_NANG"),

                                // Học kỳ 6
                                new Subject("Quan hệ công chúng (PR)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Báo chí di động (Mobile Journalism)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Báo chí điều tra", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Ứng dụng AI trong báo chí", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Quản trị truyền thông", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Sản xuất tạp chí điện tử", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Truyền thông đa phương tiện", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập chuyên ngành", 4, 7, "THUC_TAP"),
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập tốt nghiệp", 4, 8, "THUC_TAP"),
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo QTKD PTIT (8 học kỳ) - Representative (General + Digital
        // focus)
        private static List<Subject> getPTIT_BusinessAdmin_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp cho kinh tế", 3, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Kinh tế học đại cương", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Kinh tế vi mô", 3, 2, "CO_SO_NGANH"),
                                new Subject("Kinh tế vĩ mô", 3, 2, "CO_SO_NGANH"),
                                new Subject("Nguyên lý kế toán", 3, 2, "CO_SO_NGANH"),
                                new Subject("Luật kinh doanh", 3, 2, "BO_TRO"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Lý thuyết tài chính tiền tệ", 3, 3, "CO_SO_NGANH"),
                                new Subject("Quản trị học", 3, 3, "CO_SO_NGANH"),
                                new Subject("Nguyên lý thống kê kinh tế", 3, 3, "CO_SO_NGANH"),
                                new Subject("Marketing căn bản", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Quản trị nguồn nhân lực", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Thương mại điện tử", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Kinh tế lượng", 3, 4, "CO_SO_NGANH"),
                                new Subject("Tài chính doanh nghiệp", 3, 4, "CHUYEN_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Quản trị chiến lược", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Nghiên cứu thị trường", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Hệ thống thông tin quản lý (MIS)", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Đạo đức kinh doanh", 2, 5, "BO_TRO"),
                                new Subject("Kỹ năng mềm", 2, 5, "KY_NANG"),

                                // Học kỳ 6
                                new Subject("Quản trị sản xuất và tác nghiệp", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Quản trị chất lượng", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Quản trị chuỗi cung ứng (Scm)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Kỹ năng đàm phán trong KD", 3, 6, "KY_NANG"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Quản trị dự án", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Nghệ thuật lãnh đạo", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Khởi nghiệp kinh doanh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thanh toán điện tử", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Học phần chuyên ngành (Marketing/TMĐT/QT)", 6, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập tốt nghiệp", 4, 8, "THUC_TAP"),
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo TMĐT PTIT (8 học kỳ) - Representative
        private static List<Subject> getPTIT_Ecommerce_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp", 3, 1, "CO_SO_NGANH"),
                                new Subject("Pháp luật đại cương", 2, 1, "BO_TRO"),
                                new Subject("Nhập môn Thương mại điện tử", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Kinh tế vi mô", 3, 2, "CO_SO_NGANH"),
                                new Subject("Quản trị học", 3, 2, "CO_SO_NGANH"),
                                new Subject("Thiết kế Web TMĐT", 3, 2, "CO_SO_NGANH"),
                                new Subject("Nguyên lý kế toán", 3, 2, "CO_SO_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Marketing căn bản", 3, 3, "CO_SO_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 3, "CO_SO_NGANH"),
                                new Subject("Luật Thương mại điện tử", 2, 3, "BO_TRO"),
                                new Subject("Hành vi khách hàng trong TMĐT", 3, 3, "CHUYEN_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Thanh toán điện tử", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Digital Marketing", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Mạng máy tính và truyền thông", 3, 4, "CO_SO_NGANH"),
                                new Subject("Kỹ năng mềm", 2, 4, "KY_NANG"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Quản trị tác nghiệp TMĐT (E-Logistics)", 3, 5, "CHUYEN_NGANH"),
                                new Subject("An toàn bảo mật trong TMĐT", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kinh doanh trên mạng xã hội", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Hệ thống thông tin quản lý (MIS)", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Xây dựng Kế hoạch kinh doanh TMĐT", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Quản trị quan hệ khách hàng (CRM)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Công nghệ Blockchain trong TMĐT", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Khởi nghiệp TMĐT", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Phát triển ứng dụng Mobile TMĐT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích dữ liệu kinh doanh", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Quản trị chiến lược TMĐT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập chuyên ngành", 4, 7, "THUC_TAP"),
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập tốt nghiệp", 4, 8, "THUC_TAP"),
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo Game Design PTIT (8 học kỳ) - Representative
        private static List<Subject> getPTIT_GameDesign_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Tin học cơ sở", 3, 1, "CO_SO_NGANH"),
                                new Subject("Toán cao cấp 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn phát triển Game", 2, 1, "CO_SO_NGANH"),
                                new Subject("Mỹ thuật cơ bản", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),
                                new Subject("Toán cao cấp 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Ngôn ngữ lập trình C++", 3, 2, "CO_SO_NGANH"),
                                new Subject("Kỹ thuật đồ họa máy tính", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tư duy thiết kế Game (Game Design Thinking)", 3, 2, "CHUYEN_NGANH"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 3, "CO_SO_NGANH"),
                                new Subject("Toán rời rạc", 3, 3, "CO_SO_NGANH"),
                                new Subject("Lập trình Game 2D (Unity)", 3, 3, "CHUYEN_NGANH"),
                                new Subject("Thiết kế nhân vật và môi trường", 3, 3, "CHUYEN_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Thiết kế 3D cho Game", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Lập trình Game 3D (Unity/Unreal)", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Viết kịch bản Game (Game Writing)", 3, 4, "CHUYEN_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Lập trình mạng cho Game", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Thiết kế cấp độ (Level Design)", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Trí tuệ nhân tạo trong Game (Game AI)", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Kỹ xảo và Hiệu ứng trong Game (VFX)", 3, 5, "CHUYEN_NGANH"),

                                // Học kỳ 6
                                new Subject("Phát triển Game trên thiết bị di động", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thực tế ảo và Thực tế tăng cường (VR/AR)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Kinh doanh và phát hành Game", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thiết kế UI/UX cho Game", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Chuyên đề phát triển Game nâng cao", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Dự án Game (Capstone Project 1)", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Kiểm thử và đảm bảo chất lượng Game", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập chuyên ngành", 4, 7, "THUC_TAP"),
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Thực tập tốt nghiệp", 4, 8, "THUC_TAP"),
                                new Subject("Khóa luận tốt nghiệp", 10, 8, "DO_AN"));
        }

        // Chương trình đào tạo IoT PTIT (9 học kỳ) - Representative
        private static List<Subject> getPTIT_IoT_Subjects() {
                return Arrays.asList(
                                // Học kỳ 1
                                new Subject("Triết học Mác-Lênin", 3, 1, "COT_LOI"),
                                new Subject("Đại số tuyến tính", 3, 1, "CO_SO_NGANH"),
                                new Subject("Giải tích 1", 3, 1, "CO_SO_NGANH"),
                                new Subject("Tin học cơ sở 1", 2, 1, "CO_SO_NGANH"),
                                new Subject("Vật lý 1", 4, 1, "CO_SO_NGANH"),
                                new Subject("Nhập môn IoT", 2, 1, "CO_SO_NGANH"),
                                new Subject("Giáo dục thể chất 1", 0, 1, "COT_LOI"),
                                new Subject("Giáo dục quốc phòng", 8, 1, "COT_LOI"),

                                // Học kỳ 2
                                new Subject("Kinh tế chính trị Mác-Lênin", 2, 2, "COT_LOI"),
                                new Subject("Giải tích 2", 3, 2, "CO_SO_NGANH"),
                                new Subject("Vật lý 3", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tin học cơ sở 2 (Lập trình C)", 3, 2, "CO_SO_NGANH"),
                                new Subject("Mạch điện tử tương tự", 3, 2, "CO_SO_NGANH"),
                                new Subject("Tiếng Anh (Course 1)", 4, 2, "KY_NANG"),

                                // Học kỳ 3
                                new Subject("Chủ nghĩa xã hội khoa học", 2, 3, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 2)", 4, 3, "KY_NANG"),
                                new Subject("Toán rời rạc", 3, 3, "CO_SO_NGANH"),
                                new Subject("Cấu trúc dữ liệu và giải thuật", 3, 3, "CO_SO_NGANH"),
                                new Subject("Mạch điện tử số", 3, 3, "CO_SO_NGANH"),
                                new Subject("Kiến trúc máy tính", 3, 3, "CO_SO_NGANH"),

                                // Học kỳ 4
                                new Subject("Tư tưởng Hồ Chí Minh", 2, 4, "COT_LOI"),
                                new Subject("Tiếng Anh (Course 3)", 4, 4, "KY_NANG"),
                                new Subject("Xác suất thống kê", 3, 4, "CO_SO_NGANH"),
                                new Subject("Hệ điều hành", 3, 4, "CO_SO_NGANH"),
                                new Subject("Lý thuyết mạch", 3, 4, "CO_SO_NGANH"),
                                new Subject("Mạng máy tính", 3, 4, "CO_SO_NGANH"),

                                // Học kỳ 5
                                new Subject("Lịch sử Đảng cộng sản VN", 2, 5, "COT_LOI"),
                                new Subject("Kỹ thuật vi xử lý", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Cảm biến và cơ cấu chấp hành", 3, 5, "CHUYEN_NGANH"),
                                new Subject("Cơ sở dữ liệu", 3, 5, "CO_SO_NGANH"),
                                new Subject("Truyền thông số", 3, 5, "CO_SO_NGANH"),
                                new Subject("Kỹ năng mềm", 2, 5, "KY_NANG"),

                                // Học kỳ 6
                                new Subject("Lập trình nhúng (Embedded Programming)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Công nghệ mạng không dây (Wireless)", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Thiết kế hệ thống IoT", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Xử lý tín hiệu số", 3, 6, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 1", 3, 6, "CHUYEN_NGANH"),

                                // Học kỳ 7
                                new Subject("Điện toán đám mây cho IoT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("An toàn bảo mật IoT", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Phân tích dữ liệu lớn (Big Data)", 3, 7, "CHUYEN_NGANH"),
                                new Subject("Thực tập cơ sở ngành", 2, 7, "THUC_TAP"),
                                new Subject("Học phần tự chọn 2", 3, 7, "CHUYEN_NGANH"),

                                // Học kỳ 8
                                new Subject("Phát triển ứng dụng IoT (Mobile/Web)", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Trí tuệ nhân tạo biên (Edge AI)", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Dự án IoT (Project)", 3, 8, "CHUYEN_NGANH"),
                                new Subject("Học phần tự chọn 3", 3, 8, "CHUYEN_NGANH"),

                                // Học kỳ 9
                                new Subject("Thực tập tốt nghiệp", 4, 9, "THUC_TAP"),
                                new Subject("Đồ án tốt nghiệp", 10, 9, "DO_AN"));
        }

        private static List<Subject> getEE_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("EE1110", "Nhập môn Kỹ thuật Điện", 2, 1));
                // Kỳ 2
                subjects.add(new Subject("ME2011", "Cơ học kỹ thuật", 3, 2));
                subjects.add(new Subject("EE2000", "Tín hiệu và hệ thống", 3, 2));
                subjects.add(new Subject("EE101", "Mạch điện I", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("EE102", "Trường điện từ", 3, 3));
                subjects.add(new Subject("EE200", "Kỹ thuật điện tử", 3, 3));
                subjects.add(new Subject("EE301", "Hệ thống điện", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("EE302", "Máy điện", 3, 4));
                subjects.add(new Subject("EE303", "Điện tử công suất", 3, 4));
                subjects.add(new Subject("EE3140", "Đo lường điện", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("EE3490", "Điều khiển tự động", 3, 5));
                subjects.add(new Subject("EE3550", "Vật liệu kỹ thuật điện", 3, 5));
                subjects.add(new Subject("EE3110", "Truyền tải và phân phối điện", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("EE4000", "Bảo vệ rơ le và Tự động hóa", 3, 6));
                subjects.add(new Subject("EE4310", "Nhà máy điện và Trạm biến áp", 3, 6));
                subjects.add(new Subject("EE4240", "Thiết kế hệ thống điện", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("EE4010", "Nhà máy điện", 3, 7));
                subjects.add(new Subject("EE4170", "Mô hình hóa hệ thống điện", 3, 7));
                subjects.add(new Subject("EE4450", "Năng lượng tái tạo", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("EE4991", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("EE5005", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("EE5320", "Lưới điện thông minh (Smart Grid)", 3, 9));
                subjects.add(new Subject("EE5330", "Thị trường điện", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("EE5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getMaterials_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("MS1100", "Nhập môn Khoa học và Kỹ thuật Vật liệu", 2, 1));
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("MS101", "Khoa học vật liệu đại cương", 3, 3));
                subjects.add(new Subject("MS3040", "Cấu trúc vật liệu", 3, 3));
                subjects.add(new Subject("MS3070", "Tính chất vật lý của vật liệu", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("MS201", "Nhiệt động học vật liệu", 3, 4));
                subjects.add(new Subject("MS3080", "Biến đổi pha", 3, 4));
                subjects.add(new Subject("MS3100", "Phương pháp phân tích vật liệu", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("MS301", "Vật liệu kim loại", 3, 5));
                subjects.add(new Subject("MS302", "Vật liệu Polymer", 3, 5));
                subjects.add(new Subject("MS3120", "Vật liệu bán dẫn và từ", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("MS303", "Vật liệu Nano", 3, 6));
                subjects.add(new Subject("MS3110", "Ăn mòn và bảo vệ vật liệu", 3, 6));
                subjects.add(new Subject("MS3090", "Cơ tính vật liệu", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("MS4130", "Vật liệu Y sinh", 3, 7));
                subjects.add(new Subject("MS4060", "Vật liệu tổ hợp (Composite)", 3, 7));
                subjects.add(new Subject("MS4090", "Gốm kỹ thuật", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("MS4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("MS4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("MS5010", "Mô phỏng vật liệu", 3, 9));
                subjects.add(new Subject("MS5020", "Công nghệ chế tạo vật liệu tiên tiến", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("MS5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getEnvironmental_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 1));
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("EV1100", "Nhập môn Kỹ thuật Môi trường", 2, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 2));
                subjects.add(new Subject("CH3010", "Hóa lý", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("EV101", "Hóa học môi trường", 3, 3));
                subjects.add(new Subject("EV2040", "Sinh thái học môi trường", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("EV201", "Vi sinh vật môi trường", 3, 4));
                subjects.add(new Subject("EV2020", "Cơ sở kỹ thuật môi trường", 3, 4));
                subjects.add(new Subject("EV2100", "Thủy lực môi trường", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("EV301", "Kỹ thuật xử lý nước thải", 3, 5));
                subjects.add(new Subject("EV302", "Kỹ thuật xử lý khí thải", 3, 5));
                subjects.add(new Subject("EV3120", "Quá trình sinh học trong kỹ thuật MT", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("EV303", "Quản lý chất thải rắn", 3, 6));
                subjects.add(new Subject("EV4110", "Đánh giá tác động môi trường", 3, 6));
                subjects.add(new Subject("EV3150", "Quan trắc và phân tích môi trường", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("EV4080", "Biến đổi khí hậu & Năng lượng", 3, 7));
                subjects.add(new Subject("EV4130", "Quy hoạch môi trường", 3, 7));
                subjects.add(new Subject("EV4160", "Sản xuất sạch hơn", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("EV4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("EV4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("EV5020", "Công nghệ môi trường tiên tiến", 3, 9));
                subjects.add(new Subject("EV5040", "Mô hình hóa môi trường", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("EV5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getIndMgmt_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("EM1100", "Kinh tế đại cương", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("EM101", "Kinh tế vi mô", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("EM102", "Quản trị học", 3, 3));
                subjects.add(new Subject("EM1170", "Nguyên lý Marketing", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("EM201", "Quản lý sản xuất", 3, 4));
                subjects.add(new Subject("EM3020", "Luật kinh doanh", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("EM202", "Logistics căn bản", 3, 5));
                subjects.add(new Subject("EM3110", "Quản trị nhân lực", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("EM203", "Quản trị dự án", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("EM4510", "Quản trị chiến lược", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("EM4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                return subjects;
        }

        private static List<Subject> getEnglish_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("FL1100", "Tiếng Anh sơ cấp I", 3, 1));
                subjects.add(new Subject("FL1101", "Nhập môn Việt ngữ học", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("FL101", "Tiếng Anh tổng quát", 4, 2));
                subjects.add(new Subject("FL1102", "Nhập môn Văn hóa Anh-Mỹ", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("FL201", "Tiếng Anh kỹ thuật", 3, 3));
                subjects.add(new Subject("FL2101", "Ngữ âm - Âm vị học", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("FL301", "Biên dịch kỹ thuật", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("FL302", "Phiên dịch hội thảo", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("FL303", "Văn hóa Anh-Mỹ (Nâng cao)", 3, 6));
                subjects.add(new Subject("FL3105", "Tiếng Anh thương mại", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("FL4010", "Lý thuyết dịch", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("FL4990", "Khóa luận tốt nghiệp", 8, 8));
                return subjects;
        }

        private static List<Subject> getThermal_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("ME2011", "Cơ học kỹ thuật I", 3, 2));
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("HE101", "Nhiệt động học kỹ thuật", 3, 3));
                subjects.add(new Subject("HE2000", "Cơ học chất lỏng", 3, 3));
                subjects.add(new Subject("ME2202", "Nguyên lý máy", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("HE102", "Truyền nhiệt", 3, 4));
                subjects.add(new Subject("HE3010", "Đo lường nhiệt", 3, 4));
                subjects.add(new Subject("HE3020", "Thiết bị trao đổi nhiệt", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("HE201", "Kỹ thuật lạnh", 3, 5));
                subjects.add(new Subject("HE202", "Điều hòa không khí", 3, 5));
                subjects.add(new Subject("HE3030", "Máy nén", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("HE301", "Năng lượng tái tạo", 3, 6));
                subjects.add(new Subject("HE4010", "Lò hơi", 3, 6));
                subjects.add(new Subject("HE4020", "Nhà máy nhiệt điện", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("HE4050", "Tuabin hơi và khí", 3, 7));
                subjects.add(new Subject("HE4060", "Sấy và thiết bị sấy", 3, 7));
                subjects.add(new Subject("HE4080", "Tiết kiệm năng lượng", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("HE4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("HE5000", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("HE5030", "Mô phỏng hệ thống nhiệt", 3, 9));
                subjects.add(new Subject("HE5040", "Công nghệ Nhiệt lạnh tiên tiến", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("HE5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getAutomotive_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("ME2011", "Cơ học kỹ thuật I", 3, 1));
                subjects.add(new Subject("ME2202", "Nguyên lý máy", 3, 2));
                subjects.add(new Subject("ME2013", "Sức bền vật liệu", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("TE101", "Lý thuyết ô tô", 3, 3));
                subjects.add(new Subject("TE102", "Động cơ đốt trong", 3, 3));
                subjects.add(new Subject("TE2020", "Dung sai lắp ghép", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("TE201", "Kết cấu ô tô", 3, 4));
                subjects.add(new Subject("TE3000", "Công nghệ chế tạo phụ tùng ô tô", 3, 4));
                subjects.add(new Subject("TE3040", "Dao động ô tô", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("TE301", "Ô tô điện & Hybrid", 3, 5));
                subjects.add(new Subject("TE302", "Hệ thống điện tử trên ô tô", 3, 5));
                subjects.add(new Subject("TE3050", "Nhiên liệu và vật liệu ô tô", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("TE4010", "Chẩn đoán kỹ thuật ô tô", 3, 6));
                subjects.add(new Subject("TE4030", "Kiểm định kỹ thuật ô tô", 3, 6));
                subjects.add(new Subject("TE4040", "Thiết kế ô tô", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("TE4020", "Công nghệ tự lái", 3, 7));
                subjects.add(new Subject("TE4050", "Mô phỏng động lực học ô tô", 3, 7));
                subjects.add(new Subject("TE4060", "Giao thông thông minh (ITS)", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("TE4991", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("TE4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("TE5010", "Xe điện nâng cao", 3, 9));
                subjects.add(new Subject("TE5020", "Công nghệ pin và acquy", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("TE5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getLogistics_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("EM1100", "Kinh tế đại cương", 3, 1));
                subjects.add(new Subject("EM201", "Quản lý sản xuất", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("EM301", "Quản trị chuỗi cung ứng", 3, 3));
                subjects.add(new Subject("EM1170", "Nguyên lý Marketing", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("EM302", "Vận tải quốc tế", 3, 4));
                subjects.add(new Subject("EM303", "Kho hàng và tồn kho", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("EM304", "Thương mại điện tử & Logistics", 3, 5));
                subjects.add(new Subject("EM3160", "Hệ thống thông tin Logistics", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("EM3200", "Mua hàng & Cung ứng", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("EM4100", "Mô phỏng chuỗi cung ứng", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("EM4995", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                return subjects;
        }

        private static List<Subject> getPTIT_LogisticsSubjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("MA101", "Toán cao cấp 1", 2, 1));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 1));
                subjects.add(new Subject("ECO101", "Kinh tế vi mô 1", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 2));
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("IT103", "Tin học cơ sở 3", 2, 2));
                subjects.add(new Subject("MA102", "Toán cao cấp 2", 2, 2));
                subjects.add(new Subject("MA103", "Lý thuyết xác suất và thống kê", 3, 2));
                subjects.add(new Subject("ECO102", "Kinh tế vĩ mô 1", 3, 2));
                subjects.add(new Subject("LOG101", "Nguyên lý cơ bản về logistics và quản lý chuỗi cung ứng", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 4, 3));
                subjects.add(new Subject("MA104", "Toán kinh tế", 3, 3));
                subjects.add(new Subject("MGT101", "Quản trị học", 3, 3));
                subjects.add(new Subject("ECO103", "Nguyên lý thống kê kinh tế", 3, 3));
                subjects.add(new Subject("LOG201", "Quản trị chuỗi cung ứng", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản Việt Nam", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 2, 4));
                subjects.add(new Subject("ACC101", "Kế toán cho kinh doanh", 3, 4));
                subjects.add(new Subject("MKT101", "Marketing căn bản", 3, 4));
                subjects.add(new Subject("ECO301", "Thương mại điện tử căn bản", 3, 4));
                subjects.add(new Subject("LOG202", "Hệ thống thông tin logistics", 2, 4));
                subjects.add(new Subject("LOG203", "Chuyên đề 1", 2, 4));
                // Kỳ 5
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("BUS101", "Kinh doanh quốc tế", 3, 5));
                subjects.add(new Subject("ECO104", "Kinh tế lượng", 3, 5));
                subjects.add(new Subject("ELE101", "Học phần lựa chọn 1", 3, 5));
                subjects.add(new Subject("ELE102", "Học phần lựa chọn 2", 3, 5));
                subjects.add(new Subject("ELE103", "Học phần lựa chọn 3", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("MGT102", "Tâm lý quản lý", 2, 6));
                subjects.add(new Subject("LOG301", "Quản trị mua và nguồn cung ứng", 2, 6));
                subjects.add(new Subject("LOG302", "Logistics trong thương mại điện tử", 2, 6));
                subjects.add(new Subject("LOG303", "Quản lý kho và trung tâm phân phối", 2, 6));
                subjects.add(new Subject("LOG304", "Nghiệp vụ hải quan", 2, 6));
                subjects.add(new Subject("LOG305", "Giao nhận, vận tải và bảo hiểm hàng hóa", 3, 6));
                subjects.add(new Subject("LAW101", "Pháp luật trong kinh doanh và thương mại quốc tế", 3, 6));
                subjects.add(new Subject("MGT103", "Quản trị chiến lược", 3, 6));
                subjects.add(new Subject("SKILL1", "Lựa chọn kỹ năng mềm 3", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("BUS102", "Nghiệp vụ kinh doanh xuất nhập khẩu", 3, 7));
                subjects.add(new Subject("LOG401", "Quản trị vận hành và chuỗi cung ứng", 3, 7));
                subjects.add(new Subject("LOG402", "Chuyên đề 2", 2, 7));
                subjects.add(new Subject("RES101", "Phương pháp luận nghiên cứu khoa học", 2, 7));
                subjects.add(new Subject("ELE104", "Học phần tự chọn", 6, 7));
                // Kỳ 8
                subjects.add(new Subject("INT401", "Thực tập tốt nghiệp", 4, 8));
                subjects.add(new Subject("THE401", "Khóa luận tốt nghiệp", 6, 8));
                return subjects;
        }

        private static List<Subject> getPTIT_PR_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("CUL101", "Cơ sở văn hóa Việt Nam", 2, 1));
                subjects.add(new Subject("ECO100", "Kinh tế học đại cương", 4, 1));
                subjects.add(new Subject("MKT101", "Marketing căn bản", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 2));
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("MA101", "Toán cao cấp cho khối ngành kinh tế", 4, 2));
                subjects.add(new Subject("MKT201", "Hành vi người tiêu dùng", 3, 2));
                subjects.add(new Subject("PR101", "Nguyên lý quan hệ công chúng", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 3, 3));
                subjects.add(new Subject("MA103", "Lý thuyết xác suất và thống kê", 3, 3));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 3));
                subjects.add(new Subject("MGT101", "Quản trị học", 3, 3));
                subjects.add(new Subject("LAW201", "Pháp luật và đạo đức truyền thông", 2, 3));
                // Kỳ 4
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 4, 4));
                subjects.add(new Subject("MCC101", "Truyền thông Marketing tích hợp", 3, 4));
                subjects.add(new Subject("MKT301", "Marketing số", 3, 4));
                subjects.add(new Subject("PR201", "Phương tiện truyền thông trong QHCC", 3, 4));
                subjects.add(new Subject("PR202", "Quan hệ công chúng quốc tế", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản Việt Nam", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("MKT401", "Phương pháp nghiên cứu marketing", 3, 5));
                subjects.add(new Subject("ELE101", "Học phần lựa chọn 1 (**)", 2, 5));
                subjects.add(new Subject("ELE102", "Học phần lựa chọn 2 (**)", 2, 5));
                subjects.add(new Subject("ELE103", "Học phần lựa chọn 3 (**)", 2, 5));
                subjects.add(new Subject("ELE104", "Học phần lựa chọn 4 (**)", 2, 5));
                // Kỳ 6
                subjects.add(new Subject("PR301", "Lập kế hoạch quan hệ công chúng", 3, 6));
                subjects.add(new Subject("PR302", "Sáng tạo và phát triển nội dung", 3, 6));
                subjects.add(new Subject("PR303", "Tổ chức sự kiện", 3, 6));
                subjects.add(new Subject("PR304", "Quản trị tài trợ", 3, 6));
                subjects.add(new Subject("PR305", "Quản trị khủng hoảng truyền thông", 3, 6));
                subjects.add(new Subject("PR306", "Viết đa phương tiện", 2, 6));
                subjects.add(new Subject("PR307", "Quản trị thương hiệu", 2, 6));
                // Kỳ 7
                subjects.add(new Subject("RES101", "Phương pháp luận NCKH", 2, 7));
                subjects.add(new Subject("PR401", "Chuyên đề: QHCC trong MT số", 2, 7));
                subjects.add(new Subject("PR402", "Đề án: chiến dịch QHCC", 2, 7));
                subjects.add(new Subject("PR403", "Truyền thông chính sách", 4, 7));
                subjects.add(new Subject("ELE201", "Học phần lựa chọn 1 (**)", 2, 7));
                subjects.add(new Subject("ELE202", "Học phần lựa chọn 2 (**)", 2, 7));
                subjects.add(new Subject("ELE203", "Học phần lựa chọn 3 (**)", 2, 7));
                subjects.add(new Subject("ELE204", "Học phần lựa chọn 4 (**)", 2, 7));
                subjects.add(new Subject("ELE205", "Học phần lựa chọn 5 (**)", 2, 7));
                // Kỳ 8
                subjects.add(new Subject("INT499", "Thực tập và tốt nghiệp", 10, 8));
                return subjects;
        }

        private static List<Subject> getPTIT_ControlAutomation_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MA101", "Đại số", 3, 1));
                subjects.add(new Subject("MA102", "Giải tích 1", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("PHY101", "Vật lý 1 và thí nghiệm", 4, 1));
                // Kỳ 2
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("IT102", "Tin học cơ sở 2", 2, 2));
                subjects.add(new Subject("MA103", "Xác suất thống kê", 2, 2));
                subjects.add(new Subject("MA104", "Giải tích 2", 3, 2));
                subjects.add(new Subject("PHY102", "Vật lý 2 và thí nghiệm", 4, 2));
                subjects.add(new Subject("EE101", "Mạch điện", 3, 2));
                subjects.add(new Subject("CN101", "Nhập môn điều khiển và TĐH", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 4, 3));
                subjects.add(new Subject("MA105", "Toán kỹ thuật", 3, 3));
                subjects.add(new Subject("EE102", "Kỹ thuật điện tử", 3, 3));
                subjects.add(new Subject("IT201", "Ngôn ngữ lập trình C++", 3, 3));
                subjects.add(new Subject("CN201", "Phần mềm mô phỏng", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 2, 4));
                subjects.add(new Subject("CN202", "Xử lý tín hiệu số", 2, 4));
                subjects.add(new Subject("CN203", "Thiết bị và hệ thống tự động", 2, 4));
                subjects.add(new Subject("IT202", "Cấu trúc dữ liệu và giải thuật", 3, 4));
                subjects.add(new Subject("EE201", "Kỹ thuật đo điện", 2, 4));
                subjects.add(new Subject("CN204", "Cơ sở điều khiển tự động", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("CN301", "Xử lý ảnh", 3, 5));
                subjects.add(new Subject("EE301", "Điện tử công suất", 3, 5));
                subjects.add(new Subject("CN302", "Vi điều khiển", 3, 5));
                subjects.add(new Subject("CN303", "Thực hành cơ sở", 4, 5));
                subjects.add(new Subject("CN304", "Hệ thống thủy lực - khí nén", 2, 5));
                // Kỳ 6
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản VN", 2, 6));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 6));
                subjects.add(new Subject("CN305", "Truyền động điện", 3, 6));
                subjects.add(new Subject("CN306", "Rô bốt công nghiệp", 2, 6));
                subjects.add(new Subject("CN307", "Mạng truyền thông công nghiệp", 2, 6));
                subjects.add(new Subject("CN308", "Hệ thống điều khiển phi tuyến", 2, 6));
                subjects.add(new Subject("CN309", "Hệ thống điều khiển quá trình", 3, 6));
                subjects.add(new Subject("EE302", "An toàn điện", 2, 6));
                // Kỳ 7
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 7));
                subjects.add(new Subject("RES101", "Phương pháp luận NCKH", 2, 7));
                subjects.add(new Subject("CN401", "Thiết kế cơ điện", 3, 7));
                subjects.add(new Subject("CN402", "Điều khiển mờ và mạng nơ ron", 3, 7));
                subjects.add(new Subject("CN403", "Quản lý bảo trì công nghiệp", 2, 7));
                subjects.add(new Subject("CN404", "Mô hình hóa và mô phỏng", 2, 7));
                subjects.add(new Subject("CN405", "Kỹ thuật logic khả trình PLC", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("CN406", "Hệ thống giám sát ĐK và TTDL", 3, 8));
                subjects.add(new Subject("CN407", "Hệ thống điều khiển phân tán", 3, 8));
                subjects.add(new Subject("ELE401", "Học phần tự chọn 1", 2, 8));
                subjects.add(new Subject("ELE402", "Học phần tự chọn 2", 2, 8));
                subjects.add(new Subject("CN408", "Chuyên đề tự động hóa", 2, 8));
                subjects.add(new Subject("CN409", "Đồ án tự động hóa", 2, 8));
                subjects.add(new Subject("INT401", "Thực tập chuyên sâu", 3, 8));
                // Kỳ 9
                subjects.add(new Subject("INT499", "Thực tập tốt nghiệp và tốt nghiệp", 12, 9));
                return subjects;
        }

        private static List<Subject> getPTIT_RobotAI_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MA101", "Đại số", 3, 1));
                subjects.add(new Subject("MA102", "Giải tích 1", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("PHY101", "Vật lý 1 và thí nghiệm", 4, 1));
                // Kỳ 2
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("IT102", "Tin học cơ sở 2", 2, 2));
                subjects.add(new Subject("MA103", "Xác suất thống kê", 2, 2));
                subjects.add(new Subject("MA104", "Giải tích 2", 3, 2));
                subjects.add(new Subject("PHY102", "Vật lý 2 và thí nghiệm", 4, 2));
                subjects.add(new Subject("EE101", "Mạch điện", 3, 2));
                subjects.add(new Subject("CN101", "Nhập môn điều khiển và TĐH", 2, 2));
                // Kỳ 3
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 4, 3));
                subjects.add(new Subject("MA105", "Toán kỹ thuật", 3, 3));
                subjects.add(new Subject("EE102", "Kỹ thuật điện tử", 3, 3));
                subjects.add(new Subject("IT201", "Ngôn ngữ lập trình C++", 3, 3));
                subjects.add(new Subject("CN201", "Phần mềm mô phỏng", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 2, 4));
                subjects.add(new Subject("CN202", "Xử lý tín hiệu số", 2, 4));
                subjects.add(new Subject("CN203", "Hình họa và vẽ kỹ thuật", 2, 4));
                subjects.add(new Subject("IT202", "Cấu trúc dữ liệu và giải thuật", 3, 4));
                subjects.add(new Subject("EE201", "Kỹ thuật đo điện", 2, 4));
                subjects.add(new Subject("CN204", "Cơ sở điều khiển tự động", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("CN301", "Xử lý ảnh", 3, 5));
                subjects.add(new Subject("EE301", "Điện tử công suất", 3, 5));
                subjects.add(new Subject("CN302", "Vi điều khiển", 3, 5));
                subjects.add(new Subject("CN303", "Thực hành cơ sở", 4, 5));
                subjects.add(new Subject("CN304", "Hệ thống thủy lực - khí nén", 2, 5));
                // Kỳ 6
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản VN", 2, 6));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 6));
                subjects.add(new Subject("CN305", "Cảm biến và cơ cấu CH rô bốt", 3, 6));
                subjects.add(new Subject("CN306", "Rô bốt công nghiệp", 2, 6));
                subjects.add(new Subject("CN307", "Mạng truyền thông công nghiệp", 2, 6));
                subjects.add(new Subject("CN308", "Hệ thống điều khiển phi tuyến", 2, 6));
                subjects.add(new Subject("CN310", "Cơ học ứng dụng", 3, 6));
                subjects.add(new Subject("CN311", "Học sâu", 2, 6));
                // Kỳ 7
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 7));
                subjects.add(new Subject("RES101", "Phương pháp luận NCKH", 2, 7));
                subjects.add(new Subject("CN410", "Thiết kế Rô bốt", 3, 7));
                subjects.add(new Subject("CN402", "Điều khiển mờ và mạng nơ ron", 3, 7));
                subjects.add(new Subject("CN411", "Lập trình rô bốt", 3, 7));
                subjects.add(new Subject("CN404", "Mô hình hóa và mô phỏng", 2, 7));
                subjects.add(new Subject("CN412", "Động học và động lực học", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("CN413", "Thị giác máy tính", 2, 8));
                subjects.add(new Subject("CN414", "Nhập môn trí tuệ nhân tạo", 3, 8));
                subjects.add(new Subject("ELE401", "Học phần tự chọn 1", 2, 8));
                subjects.add(new Subject("ELE402", "Học phần tự chọn 2", 2, 8));
                subjects.add(new Subject("CN415", "Giải thuật cho rô bốt thông minh", 2, 8));
                subjects.add(new Subject("CN416", "Đồ án thiết kế và xây dựng rô bốt", 2, 8));
                subjects.add(new Subject("INT401", "Thực tập chuyên sâu", 3, 8));
                // Kỳ 9
                subjects.add(new Subject("INT499", "Thực tập tốt nghiệp và tốt nghiệp", 12, 9));
                return subjects;
        }

        private static List<Subject> getPTIT_MultimediaSubjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("HIS101", "Lịch sử văn minh thế giới", 2, 1));
                subjects.add(new Subject("VIA101", "Cơ sở văn hóa Việt Nam", 2, 1));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 1));
                // Kỳ 2
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 2));
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("MKT101", "Marketing căn bản", 3, 2));
                subjects.add(new Subject("MUL101", "Nhập môn truyền thông", 2, 2));
                subjects.add(new Subject("ADV101", "Nhập môn quảng cáo", 2, 2));
                subjects.add(new Subject("PR101", "Nhập môn PR", 2, 2));
                subjects.add(new Subject("MUL102", "Kỹ thuật nhiếp ảnh", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 4, 3));
                subjects.add(new Subject("MUL201", "Các loại hình báo chí hiện đại", 2, 3));
                subjects.add(new Subject("MUL202", "Lý thuyết truyền thông", 2, 3));
                subjects.add(new Subject("PR201", "Lý thuyết PR", 2, 3));
                subjects.add(new Subject("DES101", "Thiết kế đồ họa cơ bản", 3, 3));
                subjects.add(new Subject("MUL203", "Kịch bản đa phương tiện", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 4, 4));
                subjects.add(new Subject("MUL204", "Quay phim", 3, 4));
                subjects.add(new Subject("MUL205", "Viết đa phương tiện", 2, 4));
                subjects.add(new Subject("MUL206", "Biên tập đa phương tiện", 3, 4));
                subjects.add(new Subject("DES102", "Ứng dụng đồ họa đa phương tiện", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản VN", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("IT301", "Ứng dụng thiết kế web", 3, 5));
                subjects.add(new Subject("MUL301", "Pháp luật và đạo đức truyền thông", 2, 5));
                subjects.add(new Subject("MUL302", "Quản lý dự án truyền thông", 2, 5));
                subjects.add(new Subject("MUL303", "Nghệ thuật kể chuyện đa phương tiện", 2, 5));
                subjects.add(new Subject("RES101", "Phương pháp luận NCKH", 2, 5));
                subjects.add(new Subject("ELE101", "Học phần tự chọn", 2, 5));
                // Kỳ 6
                subjects.add(new Subject("MUL304", "Truyền thông và dư luận xã hội", 2, 6));
                subjects.add(new Subject("PR301", "PR: Chiến lược và thực hành", 3, 6));
                subjects.add(new Subject("MUL305", "Báo chí dữ liệu", 2, 6));
                subjects.add(new Subject("MUL306", "Phỏng vấn: Lý thuyết và thực hành", 2, 6));
                subjects.add(new Subject("ADV301", "Quảng cáo đa phương tiện", 2, 6));
                subjects.add(new Subject("MUL307", "Tổ chức sản xuất podcast", 3, 6));
                subjects.add(new Subject("MUL308", "Diễn thuyết trước công chúng", 2, 6));
                subjects.add(new Subject("ELE102", "Học phần tự chọn", 2, 6));
                subjects.add(new Subject("RES102", "Phương pháp nghiên cứu truyền thông", 2, 6));
                // Kỳ 7
                subjects.add(new Subject("MUL401", "Kịch bản phân cảnh", 3, 7));
                subjects.add(new Subject("PR401", "Rủi ro và xử lý khủng hoảng truyền thông", 2, 7));
                subjects.add(new Subject("MUL402", "Tổ chức sản xuất video", 3, 7));
                subjects.add(new Subject("ADV401", "Quảng cáo: Chiến lược và thực hành", 3, 7));
                subjects.add(new Subject("INT401", "Thực hành chuyên sâu", 4, 7));
                subjects.add(new Subject("ELE103", "Học phần tự chọn", 2, 7));
                // Kỳ 8
                subjects.add(new Subject("INT499", "Thực tập tốt nghiệp và tốt nghiệp", 10, 8));
                return subjects;
        }

        private static List<Subject> getPTIT_EEE_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MA101", "Đại số", 3, 1));
                subjects.add(new Subject("MA102", "Giải tích 1", 3, 1));
                subjects.add(new Subject("IT101", "Tin học cơ sở 1", 2, 1));
                subjects.add(new Subject("PHY101", "Vật lý 1 và thí nghiệm", 4, 1));
                // Kỳ 2
                subjects.add(new Subject("ENG101", "Tiếng Anh (Course 1)", 4, 2));
                subjects.add(new Subject("IT102", "Tin học cơ sở 2", 2, 2));
                subjects.add(new Subject("MA103", "Xác suất thống kê", 2, 2));
                subjects.add(new Subject("MA104", "Giải tích 2", 3, 2));
                subjects.add(new Subject("PHY102", "Vật lý 2 và thí nghiệm", 4, 2));
                subjects.add(new Subject("EE101", "Mạch điện 1", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ML101", "Triết học Mác-Lênin", 3, 3));
                subjects.add(new Subject("ENG102", "Tiếng Anh (Course 2)", 4, 3));
                subjects.add(new Subject("MA105", "Toán kỹ thuật", 3, 3));
                subjects.add(new Subject("EE102", "Cấu kiện điện tử", 3, 3));
                subjects.add(new Subject("IT201", "Ngôn ngữ lập trình C/C++", 3, 3));
                subjects.add(new Subject("EE103", "Mạch điện 2", 2, 3));
                // Kỳ 4
                subjects.add(new Subject("ML102", "Kinh tế chính trị Mác-Lênin", 2, 4));
                subjects.add(new Subject("ENG103", "Tiếng Anh (Course 3)", 2, 4));
                subjects.add(new Subject("EE201", "Kỹ thuật số", 3, 4));
                subjects.add(new Subject("EE202", "Kỹ thuật đo lường", 2, 4));
                subjects.add(new Subject("EE203", "Mạch tương tự", 3, 4));
                subjects.add(new Subject("CN202", "Xử lý tín hiệu số", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ML103", "Chủ nghĩa xã hội khoa học", 2, 5));
                subjects.add(new Subject("ENG104", "Tiếng Anh (Course 3 Plus)", 2, 5));
                subjects.add(new Subject("EE301", "Vi xử lý - Vi điều khiển", 3, 5));
                subjects.add(new Subject("EE302", "Trường điện từ và truyền sóng", 3, 5));
                subjects.add(new Subject("EE303", "Kỹ thuật mạch điện tử", 3, 5));
                subjects.add(new Subject("EE304", "Thực hành điện tử cơ bản", 2, 5));
                // Kỳ 6
                subjects.add(new Subject("ML104", "Lịch sử Đảng cộng sản VN", 2, 6));
                subjects.add(new Subject("LA101", "Pháp luật đại cương", 2, 6));
                subjects.add(new Subject("EE305", "Thiết kế hệ thống nhúng", 3, 6));
                subjects.add(new Subject("EE306", "Kỹ thuật cảm biến", 2, 6));
                subjects.add(new Subject("EE307", "Truyền thông số", 3, 6));
                subjects.add(new Subject("EE308", "Thực hành thiết kế mạch", 2, 6));
                subjects.add(new Subject("ELE301", "Điện tử công suất (TC)", 2, 6));
                // Kỳ 7
                subjects.add(new Subject("ML105", "Tư tưởng Hồ Chí Minh", 2, 7));
                subjects.add(new Subject("RES101", "Phương pháp luận NCKH", 2, 7));
                subjects.add(new Subject("EE401", "Thiết kế vi mạch (VLSI)", 3, 7));
                subjects.add(new Subject("EE402", "Kỹ thuật Robot", 3, 7));
                subjects.add(new Subject("EE403", "Xử lý ảnh và video", 3, 7));
                subjects.add(new Subject("EE404", "Thực hành chuyên sâu 1", 2, 7));
                // Kỳ 8
                subjects.add(new Subject("EE405", "Chuyên đề định hướng chuyên ngành", 3, 8));
                subjects.add(new Subject("EE406", "Đồ án thiết kế hệ thống", 3, 8));
                subjects.add(new Subject("ELE401", "Học phần tự chọn chuyên ngành 1", 2, 8));
                subjects.add(new Subject("ELE402", "Học phần tự chọn chuyên ngành 2", 2, 8));
                subjects.add(new Subject("INT401", "Thực tập doanh nghiệp", 3, 8));
                // Kỳ 9
                subjects.add(new Subject("INT499", "Đồ án tốt nghiệp / Thực tập tốt nghiệp", 10, 9));
                return subjects;
        }

        private static List<Subject> getFinance_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("EM101", "Kinh tế vi mô", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("BF101", "Tài chính doanh nghiệp", 3, 3));
                subjects.add(new Subject("BF102", "Thị trường tài chính", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("BF201", "Ngân hàng thương mại", 3, 4));
                subjects.add(new Subject("AC101", "Nguyên lý kế toán", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("BF202", "Phân tích đầu tư", 3, 5));
                subjects.add(new Subject("BF3050", "Tài chính quốc tế", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("BF3100", "Quản lý rủi ro tài chính", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("BF4020", "Định giá doanh nghiệp", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("BF4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                return subjects;
        }

        private static List<Subject> getAccountingHust_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("EM1100", "Kinh tế đại cương", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("AC101", "Nguyên lý kế toán", 3, 3));
                subjects.add(new Subject("AC102", "Kế toán tài chính", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("AC201", "Kế toán quản trị", 3, 4));
                subjects.add(new Subject("AC202", "Kiểm toán căn bản", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("AC3010", "Hệ thống thông tin kế toán", 3, 5));
                subjects.add(new Subject("AC3020", "Kế toán thuế", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("AC3100", "Kiểm toán tài chính", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("AC4050", "Phân tích báo cáo tài chính", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("AC4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                return subjects;
        }

        private static List<Subject> getIT1Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("IT1110", "Tin học đại cương", 4, 1));
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("MI1131", "Đại số", 3, 1));
                subjects.add(new Subject("FL1100", "Tiếng Anh sơ cấp I", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 2));
                subjects.add(new Subject("IT3011", "Cấu trúc dữ liệu và giải thuật", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("IT3020", "Toán rời rạc", 3, 3));
                subjects.add(new Subject("IT3040", "Kỹ thuật lập trình", 3, 3));
                subjects.add(new Subject("IT3070", "Nguyên lý hệ điều hành", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("IT3080", "Mạng máy tính", 3, 4));
                subjects.add(new Subject("IT3090", "Cơ sở dữ liệu", 3, 4));
                subjects.add(new Subject("IT3100", "Lập trình hướng đối tượng", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("IT4010", "An toàn thông tin", 3, 5));
                subjects.add(new Subject("IT3170", "Thuật toán ứng dụng", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("IT4015", "Nhập môn Trí tuệ nhân tạo", 3, 6));
                subjects.add(new Subject("IT4441", "Nhập môn Công nghệ Phần mềm", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("IT4501", "Quản trị dự án CNTT", 3, 7));
                subjects.add(new Subject("IT4409", "Công nghệ Web và Dịch vụ trực tuyến", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("IT4993", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                // Kỳ 9
                subjects.add(new Subject("IT5023", "Chuyên đề kỹ thuật phần mềm", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("IT5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getIT2Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("IT1110", "Tin học đại cương", 4, 1));
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("IT2000", "Điện tử cho CNTT", 4, 2));
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("IT3030", "Kiến trúc máy tính", 3, 3));
                subjects.add(new Subject("IT3011", "Cấu trúc dữ liệu và giải thuật", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("IT3070", "Nguyên lý hệ điều hành", 3, 4));
                subjects.add(new Subject("IT4060", "Thiết kế hệ thống nhúng", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("IT4062", "Mạng máy tính và truyền thông", 3, 5));
                subjects.add(new Subject("IT4210", "An ninh mạng", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("IT4341", "Thiết kế mạch tích hợp VLSI", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("IT4530", "Điện toán đám mây", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("IT4788", "Đồ án Đa ngành", 3, 8));
                // Kỳ 9
                subjects.add(new Subject("IT5315", "Internet of Things", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("IT5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getITE10Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Semester 1
                subjects.add(new Subject("IT1110", "Introduction to Computing", 4, 1));
                subjects.add(new Subject("MI1111", "Calculus 1", 4, 1));
                // Semester 2
                subjects.add(new Subject("MI2020", "Probability and Statistics", 3, 2));
                subjects.add(new Subject("IT3011", "Data Structures and Algorithms", 3, 2));
                // Semester 3
                subjects.add(new Subject("IT3190", "Introduction to Machine Learning", 3, 3));
                subjects.add(new Subject("IT2120", "Computer Architecture", 3, 3));
                // Semester 4
                subjects.add(new Subject("IT3160", "Introduction to AI", 3, 4));
                subjects.add(new Subject("IT4142", "Deep Learning", 3, 4));
                // Semester 5
                subjects.add(new Subject("IT4043", "Data Mining", 3, 5));
                subjects.add(new Subject("IT4490", "Natural Language Processing", 3, 5));
                // Semester 6
                subjects.add(new Subject("IT4650", "Big Data Processing", 3, 6));
                // Semester 7
                subjects.add(new Subject("IT4832", "Reinforcement Learning", 3, 7));
                // Semester 8
                subjects.add(new Subject("IT4993", "Capstone Project I", 6, 8));
                // Semester 9
                subjects.add(new Subject("IT5420", "Advanced AI", 3, 9));
                // Semester 10
                subjects.add(new Subject("IT5140", "Capstone Project II", 14, 10));
                return subjects;
        }

        private static List<Subject> getMI1Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("MI1131", "Đại số", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                subjects.add(new Subject("IT1110", "Tin học đại cương", 4, 2));
                // Kỳ 3
                subjects.add(new Subject("MI3050", "Tối ưu hóa", 3, 3));
                subjects.add(new Subject("MI2020", "Xác suất thống kê", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("IT3011", "Cấu trúc dữ liệu và giải thuật", 3, 4));
                subjects.add(new Subject("MI3040", "Giải tích số", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("MI3310", "Toán tài chính", 3, 5));
                subjects.add(new Subject("MI3150", "Phương trình vi phân", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("MI4060", "Phân tích dữ liệu thống kê", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("MI4302", "Mô hình toán kinh tế", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("MI4500", "Đồ án Cử nhân Toán tin", 6, 8));
                return subjects;
        }

        private static List<Subject> getEEE8Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("EE1110", "Nhập môn Kỹ thuật Điện", 2, 1));
                // Kỳ 2
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                subjects.add(new Subject("EE2000", "Tín hiệu và hệ thống", 3, 2));
                subjects.add(new Subject("EE2020", "Mạch điện", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("EE3490", "Điều khiển tự động", 3, 3));
                subjects.add(new Subject("EE3130", "Điện tử công suất", 3, 3));
                subjects.add(new Subject("EE3420", "Hệ thống điều khiển số", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("EE3410", "Vi xử lý", 3, 4));
                subjects.add(new Subject("EE3510", "Đo lường và Cảm biến", 3, 4));
                subjects.add(new Subject("EE3050", "Hệ thống điện", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("EE4040", "Truyền động điện", 3, 5));
                subjects.add(new Subject("EE4200", "Điều khiển Robot", 3, 5));
                subjects.add(new Subject("EE4520", "Mạng truyền thông công nghiệp", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("EE4212", "Điều khiển quá trình", 3, 6));
                subjects.add(new Subject("EE4430", "Hệ thống nhúng", 3, 6));
                subjects.add(new Subject("EE4000", "Bảo vệ rơ le và Tự động hóa", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("EE4501", "Hệ thống SCADA", 3, 7));
                subjects.add(new Subject("EE4460", "Trí tuệ nhân tạo trong điều khiển", 3, 7));
                subjects.add(new Subject("EE4060", "Kỹ thuật chiếu sáng", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("EE4991", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("EE5010", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("EE5510", "Điều khiển tối ưu & Thích nghi", 3, 9));
                subjects.add(new Subject("EE5230", "Kỹ thuật Robot nâng cao", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("EE5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getET1Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1-2
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                subjects.add(new Subject("ET1010", "Nhập môn Điện tử - Viễn thông", 2, 1));
                subjects.add(new Subject("MI1121", "Giải tích II", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ET2000", "Điện tử số", 3, 3));
                subjects.add(new Subject("ET2030", "Điện tử tương tự", 3, 3));
                subjects.add(new Subject("ET2040", "Lý thuyết mạch", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ET3220", "Kỹ thuật viba và anten", 3, 4));
                subjects.add(new Subject("ET3170", "Xử lý tín hiệu số", 3, 4));
                subjects.add(new Subject("ET3260", "Trường điện từ", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ET3250", "Thông tin số", 3, 5));
                subjects.add(new Subject("ET3290", "Kỹ thuật vi xử lý", 3, 5));
                subjects.add(new Subject("ET4010", "Hệ thống nhúng", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("ET4230", "Hệ thống viễn thông", 3, 6));
                subjects.add(new Subject("ET4120", "Thiết kế mạch tích hợp (VLSI)", 3, 6));
                subjects.add(new Subject("ET4150", "Mạng máy tính và viễn thông", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("ET4040", "Thông tin di động 5G", 3, 7));
                subjects.add(new Subject("ET4220", "Thông tin quang", 3, 7));
                subjects.add(new Subject("ET4280", "Thông tin vệ tinh", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("ET4993", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("ET4900", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("ET5100", "Chuyên đề viễn thông nâng cao", 3, 9));
                subjects.add(new Subject("ET5030", "Internet of Things", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("ET5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getME1Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("ME2011", "Cơ học kỹ thuật I", 3, 1));
                // Kỳ 2-3
                subjects.add(new Subject("ME2202", "Nguyên lý máy", 3, 2));
                subjects.add(new Subject("EE2000", "Tín hiệu và hệ thống", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ME3212", "Kỹ thuật Robot", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ME3213", "Các hệ thống cơ điện tử", 3, 5));
                subjects.add(new Subject("ME3025", "Vẽ kỹ thuật cơ khí", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("ME4220", "Hệ thống vi cơ điện tử (MEMS)", 3, 6));
                // Kỳ 8
                subjects.add(new Subject("ME4995", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                // Kỳ 10
                subjects.add(new Subject("ME5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getCH_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 2));
                subjects.add(new Subject("CH2010", "Hóa vô cơ", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("CH3010", "Hóa lý", 3, 3));
                subjects.add(new Subject("CH3020", "Hóa phân tích", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("CH3310", "Hóa hữu cơ", 3, 4));
                subjects.add(new Subject("CH3210", "Quá trình thủy lực và cơ học", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("CH3410", "Quá trình và thiết bị CN Hóa học", 3, 5));
                subjects.add(new Subject("CH3230", "Quá trình truyền nhiệt", 3, 5));
                subjects.add(new Subject("CH3240", "Quá trình truyền khối", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("CH4010", "Công nghệ điện hóa", 3, 6));
                subjects.add(new Subject("CH4020", "Xúc tác và Hóa dầu", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("CH4030", "Công nghệ Silicat", 3, 7));
                subjects.add(new Subject("CH4040", "Công nghệ Hóa dược", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("CH4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("CH4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("CH5010", "Thiết kế lò phản ứng", 3, 9));
                subjects.add(new Subject("CH5020", "Mô phỏng quá trình hóa học", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("CH5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getBF_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("CH3310", "Hóa hữu cơ", 3, 2));
                subjects.add(new Subject("BF2010", "Sinh học đại cương", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("BF3010", "Hóa sinh công nghiệp", 3, 3));
                subjects.add(new Subject("BF3020", "Vi sinh vật học", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("BF3030", "Sinh học tế bào", 3, 4));
                subjects.add(new Subject("BF3040", "Di truyền học", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("BF3110", "Sinh học phân tử", 3, 5));
                subjects.add(new Subject("BF3120", "Miễn dịch học", 3, 5));
                subjects.add(new Subject("BF3130", "Công nghệ enzyme", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("BF3410", "Kỹ thuật gen", 3, 6));
                subjects.add(new Subject("BF3420", "Công nghệ lên men", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("BF4010", "Tin sinh học", 3, 7));
                subjects.add(new Subject("BF4020", "Công nghệ protein", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("BF4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("BF4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("BF5010", "Công nghệ tế bào gốc", 3, 9));
                subjects.add(new Subject("BF5020", "Y sinh học phân tử", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("BF5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getFT_Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("CH3310", "Hóa hữu cơ", 3, 2));
                subjects.add(new Subject("CH3010", "Hóa lý", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("BF3010", "Hóa sinh thực phẩm", 3, 3));
                subjects.add(new Subject("BF3020", "Vi sinh vật thực phẩm", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("BF3510", "Vệ sinh an toàn thực phẩm", 3, 4));
                subjects.add(new Subject("BF3530", "Phân tích thực phẩm", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("BF3520", "Công nghệ chế biến thực phẩm", 3, 5));
                subjects.add(new Subject("BF3540", "Bao bì thực phẩm", 3, 5));
                subjects.add(new Subject("BF3550", "Dinh dưỡng học", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("BF4210", "Công nghệ sau thu hoạch", 3, 6));
                subjects.add(new Subject("BF4220", "Phát triển sản phẩm mới", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("BF4230", "Quản lý chất lượng thực phẩm", 3, 7));
                subjects.add(new Subject("BF4240", "Công nghệ chế biến sữa", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("BF4991", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("BF4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("BF5030", "Công nghệ thực phẩm chức năng", 3, 9));
                subjects.add(new Subject("BF5040", "Máy và thiết bị thực phẩm nâng cao", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("BF5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getET2Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 1));
                // Kỳ 2
                subjects.add(new Subject("ET1010", "Nhập môn Kỹ thuật", 2, 2));
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("ET3050", "Sinh lý học đại cương", 3, 3));
                subjects.add(new Subject("ET2000", "Điện tử số", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("ET3060", "Thiết bị y tế", 3, 4));
                subjects.add(new Subject("ET3070", "Cảm biến y sinh", 3, 4));
                subjects.add(new Subject("ET3080", "Mạch điện tử y sinh", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("ET3100", "Xử lý ảnh y tế", 3, 5));
                subjects.add(new Subject("ET3110", "Xử lý tín hiệu y sinh", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("ET4010", "Hệ thống Bệnh án điện tử", 3, 6));
                subjects.add(new Subject("ET4020", "Y tế từ xa (Telemedicine)", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("ET4030", "Dụng cụ y tế thông minh", 3, 7));
                subjects.add(new Subject("ET4040", "Robot y sinh", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("ET4995", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("ET4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("ET5010", "Kỹ thuật chẩn đoán hình ảnh cao cấp", 3, 9));
                subjects.add(new Subject("ET5020", "Vật liệu y sinh tiên tiến", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("ET5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }

        private static List<Subject> getTX1Subjects() {
                List<Subject> subjects = new ArrayList<>();
                // Kỳ 1
                subjects.add(new Subject("MI1111", "Giải tích I", 4, 1));
                subjects.add(new Subject("TX1100", "Nhập môn Dệt may", 2, 1));
                // Kỳ 2
                subjects.add(new Subject("PH1110", "Vật lý I", 3, 2));
                subjects.add(new Subject("CH1010", "Hóa học đại cương", 3, 2));
                // Kỳ 3
                subjects.add(new Subject("TX3010", "Vật liệu dệt may", 3, 3));
                subjects.add(new Subject("TX3030", "Cơ sở thiết kế trang phục", 3, 3));
                // Kỳ 4
                subjects.add(new Subject("TX3020", "Công nghệ may", 3, 4));
                subjects.add(new Subject("TX3040", "Hóa dệt", 3, 4));
                subjects.add(new Subject("TX3050", "Thiết bị dệt may", 3, 4));
                // Kỳ 5
                subjects.add(new Subject("TX3110", "Thiết kế thời trang", 3, 5));
                subjects.add(new Subject("TX3210", "Kỹ thuật sợi dệt", 3, 5));
                subjects.add(new Subject("TX4010", "Quản lý sản xuất dệt may", 3, 5));
                // Kỳ 6
                subjects.add(new Subject("TX4020", "Công nghệ may nâng cao", 3, 6));
                subjects.add(new Subject("TX4030", "CAD/CAM trong dệt may", 3, 6));
                subjects.add(new Subject("TX4070", "Kinh doanh thời trang", 3, 6));
                // Kỳ 7
                subjects.add(new Subject("TX4100", "Công nghệ dệt kim", 3, 7));
                subjects.add(new Subject("TX4120", "Kỹ thuật nhuộm và hoàn tất", 3, 7));
                subjects.add(new Subject("TX4200", "Kiểm tra chất lượng dệt may", 3, 7));
                // Kỳ 8
                subjects.add(new Subject("TX4990", "Đồ án tốt nghiệp Cử nhân", 6, 8));
                subjects.add(new Subject("TX4500", "Thực tập kỹ thuật", 2, 8));
                // Kỳ 9
                subjects.add(new Subject("TX5010", "Công nghệ dệt may thông minh", 3, 9));
                subjects.add(new Subject("TX5020", "Chuỗi cung ứng dệt may", 3, 9));
                // Kỳ 10
                subjects.add(new Subject("TX5140", "Đồ án tốt nghiệp Kỹ sư", 14, 10));
                return subjects;
        }
}

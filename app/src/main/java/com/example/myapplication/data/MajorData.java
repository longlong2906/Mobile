package com.example.myapplication.data;

import com.example.myapplication.models.Major;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorData {

    public static List<Major> getSampleMajors() {
        List<Major> majors = new ArrayList<>();

        // Khối Công nghệ thông tin
        Major cntt = new Major("1", "Công nghệ thông tin", "Công nghệ", 
            "Ngành học về phát triển và quản lý hệ thống thông tin, phần mềm và mạng máy tính.");
        cntt.setHollandType("I"); // Investigative
        cntt.setCareerPath(Arrays.asList(
            "Lập trình viên",
            "Kỹ sư phần mềm",
            "Chuyên gia bảo mật",
            "Kiến trúc sư hệ thống",
            "Quản lý dự án IT"
        ));
        cntt.setRequiredSkills(Arrays.asList(
            "Lập trình",
            "Tư duy logic",
            "Giải quyết vấn đề",
            "Làm việc nhóm",
            "Tiếng Anh"
        ));
        cntt.setSalaryRange("12 - 40 triệu/tháng (tùy kinh nghiệm)");
        cntt.setMarketDemand("Rất cao - Nhu cầu tuyển dụng liên tục tăng");
        cntt.setSchools(Arrays.asList("ĐH Bách Khoa HN", "ĐH Khoa học Tự nhiên", "ĐH FPT"));
        majors.add(cntt);

        // Kỹ thuật phần mềm
        Major ktpm = new Major("2", "Kỹ thuật phần mềm", "Công nghệ",
            "Chuyên sâu về thiết kế, phát triển và kiểm thử phần mềm chất lượng cao.");
        ktpm.setHollandType("I"); // Investigative
        ktpm.setCareerPath(Arrays.asList(
            "Software Engineer",
            "DevOps Engineer",
            "QA Engineer",
            "Technical Lead",
            "Product Manager"
        ));
        ktpm.setRequiredSkills(Arrays.asList(
            "Lập trình nâng cao",
            "Thiết kế hệ thống",
            "Testing",
            "Agile/Scrum",
            "Git"
        ));
        ktpm.setSalaryRange("13 - 45 triệu/tháng");
        ktpm.setMarketDemand("Rất cao - Đặc biệt tại các công ty công nghệ");
        ktpm.setSchools(Arrays.asList("ĐH Bách Khoa", "ĐH Công nghệ", "ĐH FPT"));
        majors.add(ktpm);

        // Quản trị kinh doanh
        Major qtdn = new Major("3", "Quản trị kinh doanh", "Kinh tế",
            "Đào tạo kỹ năng quản lý, điều hành và phát triển doanh nghiệp.");
        qtdn.setHollandType("E"); // Enterprising
        qtdn.setCareerPath(Arrays.asList(
            "Nhân viên quản lý",
            "Trưởng phòng",
            "Giám đốc chi nhánh",
            "CEO",
            "Tư vấn chiến lược"
        ));
        qtdn.setRequiredSkills(Arrays.asList(
            "Lãnh đạo",
            "Ra quyết định",
            "Phân tích",
            "Giao tiếp",
            "Làm việc nhóm"
        ));
        qtdn.setSalaryRange("10 - 50 triệu/tháng (tùy vị trí)");
        qtdn.setMarketDemand("Cao - Nhu cầu ổn định tại mọi doanh nghiệp");
        qtdn.setSchools(Arrays.asList("ĐH Kinh tế Quốc dân", "ĐH Ngoại thương", "ĐH RMIT"));
        majors.add(qtdn);

        // Marketing
        Major marketing = new Major("4", "Marketing", "Kinh tế",
            "Nghiên cứu thị trường, xây dựng thương hiệu và chiến lược tiếp thị.");
        marketing.setHollandType("E"); // Enterprising
        marketing.setCareerPath(Arrays.asList(
            "Marketing Executive",
            "Brand Manager",
            "Digital Marketing Manager",
            "Marketing Director",
            "CMO"
        ));
        marketing.setRequiredSkills(Arrays.asList(
            "Sáng tạo",
            "Phân tích dữ liệu",
            "Digital Marketing",
            "Content Writing",
            "SEO/SEM"
        ));
        marketing.setSalaryRange("8 - 35 triệu/tháng");
        marketing.setMarketDemand("Cao - Đặc biệt Digital Marketing");
        marketing.setSchools(Arrays.asList("ĐH Kinh tế", "ĐH Ngoại thương", "ĐH RMIT"));
        majors.add(marketing);

        // Thiết kế đồ họa
        Major thietke = new Major("5", "Thiết kế đồ họa", "Nghệ thuật",
            "Sáng tạo các sản phẩm thiết kế cho truyền thông và quảng cáo.");
        thietke.setHollandType("A"); // Artistic
        thietke.setCareerPath(Arrays.asList(
            "Graphic Designer",
            "UI/UX Designer",
            "Art Director",
            "Creative Director",
            "Freelance Designer"
        ));
        thietke.setRequiredSkills(Arrays.asList(
            "Adobe Photoshop",
            "Illustrator",
            "Figma",
            "Sáng tạo",
            "Thẩm mỹ"
        ));
        thietke.setSalaryRange("7 - 30 triệu/tháng");
        thietke.setMarketDemand("Trung bình - Cạnh tranh cao");
        thietke.setSchools(Arrays.asList("ĐH Mỹ thuật Công nghiệp", "ĐH RMIT", "Arena Multimedia"));
        majors.add(thietke);

        // Kế toán
        Major ketoan = new Major("6", "Kế toán", "Kinh tế",
            "Quản lý tài chính, kế toán và kiểm toán cho doanh nghiệp.");
        ketoan.setHollandType("C"); // Conventional
        ketoan.setCareerPath(Arrays.asList(
            "Kế toán viên",
            "Kế toán trưởng",
            "Kiểm toán viên",
            "CFO",
            "Tư vấn tài chính"
        ));
        ketoan.setRequiredSkills(Arrays.asList(
            "Tính toán chính xác",
            "Phần mềm kế toán",
            "Luật thuế",
            "Excel nâng cao",
            "Trung thực"
        ));
        ketoan.setSalaryRange("8 - 25 triệu/tháng");
        ketoan.setMarketDemand("Cao - Ổn định, cần ở mọi doanh nghiệp");
        ketoan.setSchools(Arrays.asList("ĐH Kinh tế Quốc dân", "ĐH Ngoại thương", "ĐH Kinh tế"));
        majors.add(ketoan);

        // Y khoa
        Major ykhoa = new Major("7", "Y khoa", "Y dược",
            "Đào tạo bác sĩ chẩn đoán và điều trị bệnh.");
        ykhoa.setHollandType("S"); // Social (hoặc I, nhưng Y khoa có tính giúp đỡ người khác cao)
        ykhoa.setCareerPath(Arrays.asList(
            "Bác sĩ đa khoa",
            "Bác sĩ chuyên khoa",
            "Giảng viên Y khoa",
            "Nghiên cứu Y học",
            "Giám đốc bệnh viện"
        ));
        ykhoa.setRequiredSkills(Arrays.asList(
            "Kiến thức y học",
            "Kỹ năng lâm sàng",
            "Đồng cảm",
            "Ra quyết định nhanh",
            "Học tập liên tục"
        ));
        ykhoa.setSalaryRange("15 - 60 triệu/tháng (tùy chuyên khoa)");
        ykhoa.setMarketDemand("Cao - Ngành nghề cao quý, cần nhiều nhân lực");
        ykhoa.setSchools(Arrays.asList("ĐH Y Hà Nội", "ĐH Y Dược TP.HCM", "ĐH Y khoa Phạm Ngọc Thạch"));
        majors.add(ykhoa);

        // Sư phạm Toán
        Major supham = new Major("8", "Sư phạm Toán", "Giáo dục",
            "Đào tạo giáo viên dạy Toán học tại các cấp học.");
        supham.setHollandType("S"); // Social
        supham.setCareerPath(Arrays.asList(
            "Giáo viên Toán",
            "Giáo viên chủ nhiệm",
            "Tổ trưởng",
            "Hiệu trưởng",
            "Chuyên viên Sở GD&ĐT"
        ));
        supham.setRequiredSkills(Arrays.asList(
            "Toán học",
            "Sư phạm",
            "Giao tiếp",
            "Kiên nhẫn",
            "Yêu trẻ em"
        ));
        supham.setSalaryRange("7 - 18 triệu/tháng (công lập)");
        supham.setMarketDemand("Trung bình - Ổn định tại các trường học");
        supham.setSchools(Arrays.asList("ĐH Sư phạm Hà Nội", "ĐH Sư phạm TP.HCM", "ĐH Sư phạm Kỹ thuật"));
        majors.add(supham);

        // Kỹ thuật cơ khí
        Major cokhi = new Major("9", "Kỹ thuật cơ khí", "Kỹ thuật",
            "Thiết kế, chế tạo và vận hành các hệ thống cơ khí.");
        cokhi.setHollandType("R"); // Realistic
        cokhi.setCareerPath(Arrays.asList(
            "Kỹ sư cơ khí",
            "Kỹ sư thiết kế",
            "Quản lý sản xuất",
            "Kỹ sư R&D",
            "Giám đốc kỹ thuật"
        ));
        cokhi.setRequiredSkills(Arrays.asList(
            "CAD/CAM",
            "Cơ học",
            "Vật liệu",
            "Sản xuất",
            "Giải quyết vấn đề"
        ));
        cokhi.setSalaryRange("10 - 30 triệu/tháng");
        cokhi.setMarketDemand("Cao - Nhu cầu tại các nhà máy, xí nghiệp");
        cokhi.setSchools(Arrays.asList("ĐH Bách Khoa HN", "ĐH Bách Khoa TP.HCM", "ĐH Công nghiệp"));
        majors.add(cokhi);

        // Kiến trúc
        Major kientruc = new Major("10", "Kiến trúc", "Nghệ thuật",
            "Thiết kế và quy hoạch các công trình kiến trúc và đô thị.");
        kientruc.setHollandType("A"); // Artistic
        kientruc.setCareerPath(Arrays.asList(
            "Kiến trúc sư",
            "Kiến trúc sư trưởng",
            "Giám đốc thiết kế",
            "Kiến trúc sư độc lập",
            "Giảng viên"
        ));
        kientruc.setRequiredSkills(Arrays.asList(
            "AutoCAD",
            "3D Max",
            "Sketchup",
            "Thẩm mỹ",
            "Sáng tạo"
        ));
        kientruc.setSalaryRange("12 - 40 triệu/tháng");
        kientruc.setMarketDemand("Cao - Ngành hot với bất động sản phát triển");
        kientruc.setSchools(Arrays.asList("ĐH Kiến trúc HN", "ĐH Bách Khoa", "ĐH Kiến trúc TP.HCM"));
        majors.add(kientruc);

        return majors;
    }

    public static List<String> getCategories() {
        return Arrays.asList(
            "Tất cả",
            "Công nghệ",
            "Kinh tế",
            "Nghệ thuật",
            "Y dược",
            "Giáo dục",
            "Kỹ thuật"
        );
    }

    // Get majors by Holland type code
    public static List<Major> getMajorsByHollandType(String hollandCode) {
        List<Major> allMajors = getSampleMajors();
        List<Major> filteredMajors = new ArrayList<>();
        
        for (Major major : allMajors) {
            if (major.getHollandType() != null && major.getHollandType().equals(hollandCode)) {
                filteredMajors.add(major);
            }
        }
        
        return filteredMajors;
    }
}


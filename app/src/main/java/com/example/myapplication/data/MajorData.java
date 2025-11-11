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
            "Ngành Công nghệ thông tin chuyên về nghiên cứu, phát triển và quản lý các hệ thống thông tin, " +
            "phần mềm, mạng máy tính và cơ sở dữ liệu. Sinh viên sẽ được đào tạo kiến thức về lập trình, " +
            "thiết kế hệ thống, bảo mật, trí tuệ nhân tạo và các công nghệ mới nhất trong lĩnh vực IT.");
        
        cntt.setHollandType("I"); // Investigative
        
        // Yêu cầu
        cntt.setEducationRequirement("Tốt nghiệp THPT, ưu tiên học sinh giỏi Toán, Tin học. Cần có tư duy logic tốt và đam mê công nghệ.");
        cntt.setTechnicalSkills(Arrays.asList(
            "Lập trình (Java, Python, C++, JavaScript)",
            "Cấu trúc dữ liệu và Giải thuật",
            "Hệ quản trị cơ sở dữ liệu (SQL, NoSQL)",
            "Mạng máy tính và bảo mật",
            "Công nghệ Web (HTML, CSS, React, Angular)",
            "Công nghệ Mobile (Android, iOS)",
            "Cloud Computing (AWS, Azure, Google Cloud)"
        ));
        cntt.setSoftSkills(Arrays.asList(
            "Tư duy logic và phân tích",
            "Giải quyết vấn đề",
            "Làm việc nhóm hiệu quả",
            "Tự học và cập nhật kiến thức",
            "Giao tiếp và trình bày ý tưởng",
            "Quản lý thời gian"
        ));
        cntt.setSuitableFor("Người yêu thích công nghệ, có khả năng tư duy logic tốt, kiên nhẫn, thích giải quyết vấn đề phức tạp, " +
            "ham học hỏi và luôn cập nhật kiến thức mới. Phù hợp với những ai có khả năng làm việc độc lập hoặc theo nhóm.");
        
        // Phát triển nghề nghiệp
        cntt.setCareerPath(Arrays.asList(
            "Junior Developer (0-2 năm): Lập trình viên, Developer",
            "Middle Developer (2-5 năm): Senior Developer, Team Leader",
            "Senior Level (5-8 năm): Tech Lead, Solution Architect",
            "Management (8+ năm): Project Manager, IT Manager, CTO",
            "Chuyên gia: Security Expert, AI Specialist, DevOps Engineer"
        ));
        cntt.setWorkEnvironments(Arrays.asList(
            "Công ty công nghệ (IT companies, Software houses)",
            "Công ty đa quốc gia (FPT, Viettel, VNG, TMA)",
            "Startup công nghệ",
            "Ngân hàng, Tài chính",
            "Tổ chức giáo dục và nghiên cứu",
            "Freelance và Remote work"
        ));
        
        // Thu nhập và cơ hội
        cntt.setSalaryRange("12 - 40 triệu/tháng (tùy kinh nghiệm và vị trí). Fresher: 8-15 triệu, Junior: 12-20 triệu, Middle: 20-35 triệu, Senior: 35-60 triệu+");
        cntt.setJobOpportunities("Nhu cầu tuyển dụng cực kỳ cao và liên tục tăng. Việt Nam đang thiếu hơn 500,000 nhân lực IT. " +
            "Cơ hội làm việc tại các công ty lớn trong và ngoài nước, mức lương cạnh tranh, cơ hội thăng tiến nhanh. " +
            "Xu hướng tương lai: AI, Machine Learning, Blockchain, Cloud Computing, IoT sẽ tạo ra hàng triệu việc làm mới.");
        
        // Thách thức
        cntt.setChallenges(Arrays.asList(
            "Áp lực deadline và khối lượng công việc lớn",
            "Cần cập nhật kiến thức liên tục do công nghệ thay đổi nhanh",
            "Làm việc nhiều giờ, có thể phải overtime",
            "Cạnh tranh cao trong ngành",
            "Yêu cầu tiếng Anh tốt để đọc tài liệu và làm việc quốc tế",
            "Có thể gặp căng thẳng khi giải quyết bug phức tạp"
        ));
        
        // Đào tạo
        cntt.setSchools(Arrays.asList(
            "ĐH Bách Khoa Hà Nội",
            "ĐH Bách Khoa TP.HCM",
            "ĐH Công nghệ - ĐHQGHN",
            "ĐH Khoa học Tự nhiên - ĐHQGHN",
            "ĐH FPT",
            "ĐH RMIT",
            "ĐH Duy Tân",
            "ĐH Sư phạm Kỹ thuật TP.HCM"
        ));
        
        // Legacy fields for backward compatibility
        cntt.setRequiredSkills(Arrays.asList("Lập trình", "Tư duy logic", "Giải quyết vấn đề", "Làm việc nhóm", "Tiếng Anh"));
        cntt.setMarketDemand("Rất cao - Nhu cầu tuyển dụng liên tục tăng");
        
        majors.add(cntt);

        // Kỹ thuật phần mềm
        Major ktpm = new Major("2", "Kỹ thuật phần mềm", "Công nghệ",
            "Ngành Kỹ thuật phần mềm tập trung vào việc ứng dụng các nguyên lý kỹ thuật vào quá trình " +
            "phát triển phần mềm. Sinh viên sẽ học cách thiết kế, xây dựng, kiểm thử và bảo trì các " +
            "hệ thống phần mềm quy mô lớn với chất lượng cao.");
        
        ktpm.setHollandType("I"); // Investigative
        
        ktpm.setEducationRequirement("Tốt nghiệp THPT, giỏi Toán, Tin học. Cần có tư duy hệ thống, logic tốt và đam mê lập trình.");
        ktpm.setTechnicalSkills(Arrays.asList(
            "Lập trình nâng cao (Java, C#, Python)",
            "Thiết kế phần mềm và kiến trúc hệ thống",
            "Testing và Quality Assurance",
            "Version Control (Git, SVN)",
            "Database Design",
            "Agile/Scrum Methodology",
            "CI/CD Pipeline"
        ));
        ktpm.setSoftSkills(Arrays.asList(
            "Tư duy phản biện",
            "Giải quyết vấn đề phức tạp",
            "Làm việc nhóm",
            "Quản lý dự án",
            "Giao tiếp với khách hàng",
            "Tự học và nghiên cứu"
        ));
        ktpm.setSuitableFor("Người có tư duy hệ thống tốt, thích xây dựng giải pháp quy mô lớn, " +
            "có khả năng làm việc theo quy trình, chịu được áp lực và deadline. Phù hợp với những ai " +
            "muốn làm việc trong môi trường chuyên nghiệp, có quy trình rõ ràng.");
        
        ktpm.setCareerPath(Arrays.asList(
            "Junior Software Engineer (0-2 năm)",
            "Software Engineer (2-4 năm)",
            "Senior Software Engineer (4-7 năm)",
            "Tech Lead/Solution Architect (7-10 năm)",
            "Engineering Manager/CTO (10+ năm)"
        ));
        ktpm.setWorkEnvironments(Arrays.asList(
            "Công ty phần mềm lớn (FPT Software, TMA Solutions)",
            "Công ty công nghệ đa quốc gia",
            "Software House và Outsourcing",
            "Startup công nghệ",
            "Tư vấn và phát triển giải pháp"
        ));
        
        ktpm.setSalaryRange("13 - 45 triệu/tháng. Fresher: 10-18 triệu, Junior: 15-25 triệu, Middle: 25-40 triệu, Senior: 40-70 triệu+");
        ktpm.setJobOpportunities("Nhu cầu rất cao, đặc biệt tại các công ty công nghệ và outsourcing. " +
            "Cơ hội làm việc với các dự án quốc tế, công nghệ hiện đại. Xu hướng Cloud Native, " +
            "Microservices, DevOps đang tạo nhiều cơ hội mới.");
        
        ktpm.setChallenges(Arrays.asList(
            "Áp lực về deadline và chất lượng code",
            "Phải cập nhật công nghệ và framework mới liên tục",
            "Làm việc với legacy code phức tạp",
            "Cần cân bằng giữa tốc độ và chất lượng",
            "Yêu cầu tiếng Anh tốt cho dự án quốc tế"
        ));
        
        ktpm.setSchools(Arrays.asList(
            "ĐH Bách Khoa Hà Nội",
            "ĐH Bách Khoa TP.HCM",
            "ĐH Công nghệ - ĐHQGHN",
            "ĐH FPT",
            "ĐH Duy Tân",
            "ĐH CNTT - ĐHQG TP.HCM"
        ));
        
        ktpm.setRequiredSkills(Arrays.asList("Lập trình nâng cao", "Thiết kế hệ thống", "Testing", "Agile/Scrum", "Git"));
        ktpm.setMarketDemand("Rất cao - Đặc biệt tại các công ty công nghệ");
        
        majors.add(ktpm);

        // Quản trị kinh doanh
        Major qtdn = new Major("3", "Quản trị kinh doanh", "Kinh tế",
            "Ngành Quản trị kinh doanh trang bị kiến thức toàn diện về quản lý, điều hành và phát triển " +
            "doanh nghiệp. Sinh viên sẽ học cách ra quyết định chiến lược, quản lý nguồn lực, phát triển " +
            "thị trường và lãnh đạo đội nhóm hiệu quả.");
        
        qtdn.setHollandType("E"); // Enterprising
        
        qtdn.setEducationRequirement("Tốt nghiệp THPT, ưu tiên học sinh có điểm tốt các môn Toán, Văn, Ngoại ngữ. Cần có tư duy logic, khả năng phân tích và đam mê kinh doanh.");
        qtdn.setTechnicalSkills(Arrays.asList(
            "Quản lý dự án (Project Management)",
            "Phân tích tài chính và báo cáo",
            "Marketing và Sales",
            "Quản trị nguồn nhân lực",
            "Lập kế hoạch chiến lược",
            "Excel, PowerPoint nâng cao",
            "ERP Systems"
        ));
        qtdn.setSoftSkills(Arrays.asList(
            "Kỹ năng lãnh đạo và quản lý",
            "Ra quyết định và giải quyết vấn đề",
            "Giao tiếp và thuyết phục",
            "Làm việc nhóm và xây dựng mối quan hệ",
            "Tư duy chiến lược",
            "Quản lý thời gian và công việc"
        ));
        qtdn.setSuitableFor("Người có khả năng lãnh đạo, tự tin, thích làm việc với con người, " +
            "có tầm nhìn chiến lược, chịu được áp lực và thách thức. Phù hợp với những ai muốn " +
            "khởi nghiệp hoặc phát triển sự nghiệp quản lý trong doanh nghiệp.");
        
        qtdn.setCareerPath(Arrays.asList(
            "Management Trainee/Nhân viên (0-2 năm)",
            "Supervisor/Trưởng nhóm (2-4 năm)",
            "Manager/Trưởng phòng (4-7 năm)",
            "Senior Manager/Giám đốc bộ phận (7-10 năm)",
            "Director/CEO/Tư vấn chiến lược (10+ năm)"
        ));
        qtdn.setWorkEnvironments(Arrays.asList(
            "Doanh nghiệp tư nhân và tập đoàn",
            "Công ty đa quốc gia",
            "Startup và doanh nghiệp SME",
            "Ngân hàng và tài chính",
            "Công ty tư vấn quản lý",
            "Tự kinh doanh"
        ));
        
        qtdn.setSalaryRange("10 - 50 triệu/tháng (tùy vị trí). Fresher: 8-12 triệu, Supervisor: 12-20 triệu, Manager: 20-40 triệu, Director: 40-100 triệu+");
        qtdn.setJobOpportunities("Nhu cầu cao và ổn định tại mọi loại hình doanh nghiệp. " +
            "Mỗi công ty đều cần người quản lý. Cơ hội thăng tiến rõ ràng từ nhân viên lên quản lý cấp cao. " +
            "Xu hướng chuyển đổi số đang tạo nhu cầu về quản lý có hiểu biết công nghệ.");
        
        qtdn.setChallenges(Arrays.asList(
            "Áp lực công việc và trách nhiệm lớn",
            "Cần có kinh nghiệm thực tế để thăng tiến",
            "Phải cân bằng nhiều lợi ích khác nhau",
            "Cạnh tranh cao trong thị trường lao động",
            "Yêu cầu học tập và phát triển liên tục",
            "Làm việc nhiều giờ, thường xuyên overtime"
        ));
        
        qtdn.setSchools(Arrays.asList(
            "ĐH Kinh tế Quốc dân",
            "ĐH Ngoại thương",
            "ĐH Kinh tế TP.HCM",
            "ĐH RMIT",
            "ĐH Fulbright",
            "ĐH Ngân hàng TP.HCM"
        ));
        
        qtdn.setRequiredSkills(Arrays.asList("Lãnh đạo", "Ra quyết định", "Phân tích", "Giao tiếp", "Làm việc nhóm"));
        qtdn.setMarketDemand("Cao - Nhu cầu ổn định tại mọi doanh nghiệp");
        
        majors.add(qtdn);

        // Marketing
        Major marketing = new Major("4", "Marketing", "Kinh tế",
            "Ngành Marketing đào tạo kiến thức về nghiên cứu thị trường, xây dựng thương hiệu, " +
            "và triển khai các chiến dịch tiếp thị hiệu quả. Đặc biệt là Digital Marketing với " +
            "các kênh online như Social Media, SEO, Content Marketing, Email Marketing...");
        
        marketing.setHollandType("E"); // Enterprising
        
        marketing.setEducationRequirement("Tốt nghiệp THPT, ưu tiên học sinh có khả năng sáng tạo, giao tiếp tốt. Cần có tư duy phân tích và đam mê về thương hiệu, truyền thông.");
        marketing.setTechnicalSkills(Arrays.asList(
            "Digital Marketing (Facebook Ads, Google Ads)",
            "SEO/SEM và Google Analytics",
            "Content Marketing và Copywriting",
            "Social Media Marketing",
            "Email Marketing",
            "Marketing Automation tools",
            "Adobe Photoshop, Canva (basic design)"
        ));
        marketing.setSoftSkills(Arrays.asList(
            "Sáng tạo và tư duy đổi mới",
            "Phân tích dữ liệu và insights",
            "Giao tiếp và thuyết trình",
            "Làm việc nhóm đa chức năng",
            "Quản lý dự án và ngân sách",
            "Thích ứng với xu hướng mới"
        ));
        marketing.setSuitableFor("Người có óc sáng tạo, năng động, thích khám phá xu hướng mới, " +
            "yêu thích mạng xã hội và công nghệ số. Phù hợp với những ai có kỹ năng giao tiếp tốt, " +
            "thích làm việc với nhiều người và có khả năng chịu áp lực về KPI.");
        
        marketing.setCareerPath(Arrays.asList(
            "Marketing Executive (0-2 năm)",
            "Marketing Specialist (2-4 năm)",
            "Brand Manager/Marketing Manager (4-7 năm)",
            "Marketing Director (7-10 năm)",
            "CMO/VP Marketing (10+ năm)"
        ));
        marketing.setWorkEnvironments(Arrays.asList(
            "Agency Marketing và quảng cáo",
            "E-commerce và Retail",
            "Công ty công nghệ và Startup",
            "FMCG và hàng tiêu dùng",
            "Ngân hàng và dịch vụ",
            "Freelance và tư vấn độc lập"
        ));
        
        marketing.setSalaryRange("8 - 35 triệu/tháng. Fresher: 6-10 triệu, Executive: 10-15 triệu, Specialist: 15-25 triệu, Manager: 25-45 triệu, Director: 45-80 triệu+");
        marketing.setJobOpportunities("Nhu cầu rất cao, đặc biệt là Digital Marketing. " +
            "Mọi doanh nghiệp đều cần Marketing để tiếp cận khách hàng. Xu hướng chuyển đổi số " +
            "đang tạo ra hàng nghìn vị trí mới về Performance Marketing, Growth Hacking, Marketing Automation.");
        
        marketing.setChallenges(Arrays.asList(
            "Áp lực về KPI và doanh số",
            "Phải cập nhật xu hướng và công nghệ liên tục",
            "Cạnh tranh cao trong ngành",
            "Làm việc ngoài giờ khi có chiến dịch",
            "Cần đầu tư thời gian học hỏi công cụ mới",
            "Đôi khi phải làm việc với ngân sách hạn chế"
        ));
        
        marketing.setSchools(Arrays.asList(
            "ĐH Kinh tế Quốc dân",
            "ĐH Ngoại thương",
            "ĐH Kinh tế TP.HCM",
            "ĐH RMIT",
            "ĐH Hoa Sen",
            "ĐH Kinh tế - Luật"
        ));
        
        marketing.setRequiredSkills(Arrays.asList("Sáng tạo", "Phân tích dữ liệu", "Digital Marketing", "Content Writing", "SEO/SEM"));
        marketing.setMarketDemand("Cao - Đặc biệt Digital Marketing");
        
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


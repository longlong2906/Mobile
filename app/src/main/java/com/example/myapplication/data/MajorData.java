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
        cntt.setEducationRequirement(
                "Tốt nghiệp THPT, ưu tiên học sinh giỏi Toán, Tin học. Cần có tư duy logic tốt và đam mê công nghệ.");
        cntt.setTechnicalSkills(Arrays.asList(
                "Lập trình (Java, Python, C++, JavaScript)",
                "Cấu trúc dữ liệu và Giải thuật",
                "Hệ quản trị cơ sở dữ liệu (SQL, NoSQL)",
                "Mạng máy tính và bảo mật",
                "Công nghệ Web (HTML, CSS, React, Angular)",
                "Công nghệ Mobile (Android, iOS)",
                "Cloud Computing (AWS, Azure, Google Cloud)"));
        cntt.setSoftSkills(Arrays.asList(
                "Tư duy logic và phân tích",
                "Giải quyết vấn đề",
                "Làm việc nhóm hiệu quả",
                "Tự học và cập nhật kiến thức",
                "Giao tiếp và trình bày ý tưởng",
                "Quản lý thời gian"));
        cntt.setSuitableFor(
                "Người yêu thích công nghệ, có khả năng tư duy logic tốt, kiên nhẫn, thích giải quyết vấn đề phức tạp, "
                        +
                        "ham học hỏi và luôn cập nhật kiến thức mới. Phù hợp với những ai có khả năng làm việc độc lập hoặc theo nhóm.");

        // Phát triển nghề nghiệp
        cntt.setCareerPath(Arrays.asList(
                "Junior Developer (0-2 năm): Lập trình viên, Developer",
                "Middle Developer (2-5 năm): Senior Developer, Team Leader",
                "Senior Level (5-8 năm): Tech Lead, Solution Architect",
                "Management (8+ năm): Project Manager, IT Manager, CTO",
                "Chuyên gia: Security Expert, AI Specialist, DevOps Engineer"));
        cntt.setWorkEnvironments(Arrays.asList(
                "Công ty công nghệ (IT companies, Software houses)",
                "Công ty đa quốc gia (FPT, Viettel, VNG, TMA)",
                "Startup công nghệ",
                "Ngân hàng, Tài chính",
                "Tổ chức giáo dục và nghiên cứu",
                "Freelance và Remote work"));

        // Thu nhập và cơ hội
        cntt.setSalaryRange(
                "12 - 40 triệu/tháng (tùy kinh nghiệm và vị trí). Fresher: 8-15 triệu, Junior: 12-20 triệu, Middle: 20-35 triệu, Senior: 35-60 triệu+");
        cntt.setJobOpportunities(
                "Nhu cầu tuyển dụng cực kỳ cao và liên tục tăng. Việt Nam đang thiếu hơn 500,000 nhân lực IT. " +
                        "Cơ hội làm việc tại các công ty lớn trong và ngoài nước, mức lương cạnh tranh, cơ hội thăng tiến nhanh. "
                        +
                        "Xu hướng tương lai: AI, Machine Learning, Blockchain, Cloud Computing, IoT sẽ tạo ra hàng triệu việc làm mới.");

        // Thách thức
        cntt.setChallenges(Arrays.asList(
                "Áp lực deadline và khối lượng công việc lớn",
                "Cần cập nhật kiến thức liên tục do công nghệ thay đổi nhanh",
                "Làm việc nhiều giờ, có thể phải overtime",
                "Cạnh tranh cao trong ngành",
                "Yêu cầu tiếng Anh tốt để đọc tài liệu và làm việc quốc tế",
                "Có thể gặp căng thẳng khi giải quyết bug phức tạp"));

        // Đào tạo
        cntt.setSchools(Arrays.asList(
                "ĐH Bách Khoa Hà Nội",
                "ĐH Bách Khoa TP.HCM",
                "ĐH Công nghệ - ĐHQGHN",
                "PTIT",
                "ĐH Khoa học Tự nhiên - ĐHQGHN",
                "ĐH FPT",
                "ĐH RMIT",
                "ĐH Duy Tân",
                "ĐH Sư phạm Kỹ thuật TP.HCM"));

        // Legacy fields for backward compatibility
        cntt.setRequiredSkills(
                Arrays.asList("Lập trình", "Tư duy logic", "Giải quyết vấn đề", "Làm việc nhóm", "Tiếng Anh"));
        cntt.setMarketDemand("Rất cao - Nhu cầu tuyển dụng liên tục tăng");

        majors.add(cntt);

        // Kỹ thuật phần mềm
        Major ktpm = new Major("2", "Kỹ thuật phần mềm", "Công nghệ",
                "Ngành Kỹ thuật phần mềm tập trung vào việc ứng dụng các nguyên lý kỹ thuật vào quá trình " +
                        "phát triển phần mềm. Sinh viên sẽ học cách thiết kế, xây dựng, kiểm thử và bảo trì các " +
                        "hệ thống phần mềm quy mô lớn với chất lượng cao.");

        ktpm.setHollandType("I"); // Investigative

        ktpm.setEducationRequirement(
                "Tốt nghiệp THPT, giỏi Toán, Tin học. Cần có tư duy hệ thống, logic tốt và đam mê lập trình.");
        ktpm.setTechnicalSkills(Arrays.asList(
                "Lập trình nâng cao (Java, C#, Python)",
                "Thiết kế phần mềm và kiến trúc hệ thống",
                "Testing và Quality Assurance",
                "Version Control (Git, SVN)",
                "Database Design",
                "Agile/Scrum Methodology",
                "CI/CD Pipeline"));
        ktpm.setSoftSkills(Arrays.asList(
                "Tư duy phản biện",
                "Giải quyết vấn đề phức tạp",
                "Làm việc nhóm",
                "Quản lý dự án",
                "Giao tiếp với khách hàng",
                "Tự học và nghiên cứu"));
        ktpm.setSuitableFor("Người có tư duy hệ thống tốt, thích xây dựng giải pháp quy mô lớn, " +
                "có khả năng làm việc theo quy trình, chịu được áp lực và deadline. Phù hợp với những ai " +
                "muốn làm việc trong môi trường chuyên nghiệp, có quy trình rõ ràng.");

        ktpm.setCareerPath(Arrays.asList(
                "Junior Software Engineer (0-2 năm)",
                "Software Engineer (2-4 năm)",
                "Senior Software Engineer (4-7 năm)",
                "Tech Lead/Solution Architect (7-10 năm)",
                "Engineering Manager/CTO (10+ năm)"));
        ktpm.setWorkEnvironments(Arrays.asList(
                "Công ty phần mềm lớn (FPT Software, TMA Solutions)",
                "Công ty công nghệ đa quốc gia",
                "Software House và Outsourcing",
                "Startup công nghệ",
                "Tư vấn và phát triển giải pháp"));

        ktpm.setSalaryRange(
                "13 - 45 triệu/tháng. Fresher: 10-18 triệu, Junior: 15-25 triệu, Middle: 25-40 triệu, Senior: 40-70 triệu+");
        ktpm.setJobOpportunities("Nhu cầu rất cao, đặc biệt tại các công ty công nghệ và outsourcing. " +
                "Cơ hội làm việc với các dự án quốc tế, công nghệ hiện đại. Xu hướng Cloud Native, " +
                "Microservices, DevOps đang tạo nhiều cơ hội mới.");

        ktpm.setChallenges(Arrays.asList(
                "Áp lực về deadline và chất lượng code",
                "Phải cập nhật công nghệ và framework mới liên tục",
                "Làm việc với legacy code phức tạp",
                "Cần cân bằng giữa tốc độ và chất lượng",
                "Yêu cầu tiếng Anh tốt cho dự án quốc tế"));

        ktpm.setSchools(Arrays.asList(
                "ĐH Bách Khoa Hà Nội",
                "ĐH Bách Khoa TP.HCM",
                "ĐH Công nghệ - ĐHQGHN",
                "ĐH FPT",
                "ĐH Duy Tân",
                "ĐH CNTT - ĐHQG TP.HCM"));

        ktpm.setRequiredSkills(
                Arrays.asList("Lập trình nâng cao", "Thiết kế hệ thống", "Testing", "Agile/Scrum", "Git"));
        ktpm.setMarketDemand("Rất cao - Đặc biệt tại các công ty công nghệ");

        majors.add(ktpm);

        // Quản trị kinh doanh
        Major qtdn = new Major("3", "Quản trị kinh doanh", "Kinh tế",
                "Ngành Quản trị kinh doanh trang bị kiến thức toàn diện về quản lý, điều hành và phát triển " +
                        "doanh nghiệp. Sinh viên sẽ học cách ra quyết định chiến lược, quản lý nguồn lực, phát triển " +
                        "thị trường và lãnh đạo đội nhóm hiệu quả.");

        qtdn.setHollandType("E"); // Enterprising

        qtdn.setEducationRequirement(
                "Tốt nghiệp THPT, ưu tiên học sinh có điểm tốt các môn Toán, Văn, Ngoại ngữ. Cần có tư duy logic, khả năng phân tích và đam mê kinh doanh.");
        qtdn.setTechnicalSkills(Arrays.asList(
                "Quản lý dự án (Project Management)",
                "Phân tích tài chính và báo cáo",
                "Marketing và Sales",
                "Quản trị nguồn nhân lực",
                "Lập kế hoạch chiến lược",
                "Excel, PowerPoint nâng cao",
                "ERP Systems"));
        qtdn.setSoftSkills(Arrays.asList(
                "Kỹ năng lãnh đạo và quản lý",
                "Ra quyết định và giải quyết vấn đề",
                "Giao tiếp và thuyết phục",
                "Làm việc nhóm và xây dựng mối quan hệ",
                "Tư duy chiến lược",
                "Quản lý thời gian và công việc"));
        qtdn.setSuitableFor("Người có khả năng lãnh đạo, tự tin, thích làm việc với con người, " +
                "có tầm nhìn chiến lược, chịu được áp lực và thách thức. Phù hợp với những ai muốn " +
                "khởi nghiệp hoặc phát triển sự nghiệp quản lý trong doanh nghiệp.");

        qtdn.setCareerPath(Arrays.asList(
                "Management Trainee/Nhân viên (0-2 năm)",
                "Supervisor/Trưởng nhóm (2-4 năm)",
                "Manager/Trưởng phòng (4-7 năm)",
                "Senior Manager/Giám đốc bộ phận (7-10 năm)",
                "Director/CEO/Tư vấn chiến lược (10+ năm)"));
        qtdn.setWorkEnvironments(Arrays.asList(
                "Doanh nghiệp tư nhân và tập đoàn",
                "Công ty đa quốc gia",
                "Startup và doanh nghiệp SME",
                "Ngân hàng và tài chính",
                "Công ty tư vấn quản lý",
                "Tự kinh doanh"));

        qtdn.setSalaryRange(
                "10 - 50 triệu/tháng (tùy vị trí). Fresher: 8-12 triệu, Supervisor: 12-20 triệu, Manager: 20-40 triệu, Director: 40-100 triệu+");
        qtdn.setJobOpportunities("Nhu cầu cao và ổn định tại mọi loại hình doanh nghiệp. " +
                "Mỗi công ty đều cần người quản lý. Cơ hội thăng tiến rõ ràng từ nhân viên lên quản lý cấp cao. " +
                "Xu hướng chuyển đổi số đang tạo nhu cầu về quản lý có hiểu biết công nghệ.");

        qtdn.setChallenges(Arrays.asList(
                "Áp lực công việc và trách nhiệm lớn",
                "Cần có kinh nghiệm thực tế để thăng tiến",
                "Phải cân bằng nhiều lợi ích khác nhau",
                "Cạnh tranh cao trong thị trường lao động",
                "Yêu cầu học tập và phát triển liên tục",
                "Làm việc nhiều giờ, thường xuyên overtime"));

        qtdn.setSchools(Arrays.asList(
                "ĐH Kinh tế Quốc dân",
                "ĐH Ngoại thương",
                "ĐH Kinh tế TP.HCM",
                "ĐH RMIT",
                "ĐH Fulbright",
                "ĐH Ngân hàng TP.HCM"));

        qtdn.setRequiredSkills(Arrays.asList("Lãnh đạo", "Ra quyết định", "Phân tích", "Giao tiếp", "Làm việc nhóm"));
        qtdn.setMarketDemand("Cao - Nhu cầu ổn định tại mọi doanh nghiệp");

        majors.add(qtdn);

        // Marketing
        Major marketing = new Major("4", "Marketing", "Kinh tế",
                "Ngành Marketing đào tạo kiến thức về nghiên cứu thị trường, xây dựng thương hiệu, " +
                        "và triển khai các chiến dịch tiếp thị hiệu quả. Đặc biệt là Digital Marketing với " +
                        "các kênh online như Social Media, SEO, Content Marketing, Email Marketing...");

        marketing.setHollandType("E"); // Enterprising

        marketing.setEducationRequirement(
                "Tốt nghiệp THPT, ưu tiên học sinh có khả năng sáng tạo, giao tiếp tốt. Cần có tư duy phân tích và đam mê về thương hiệu, truyền thông.");
        marketing.setTechnicalSkills(Arrays.asList(
                "Digital Marketing (Facebook Ads, Google Ads)",
                "SEO/SEM và Google Analytics",
                "Content Marketing và Copywriting",
                "Social Media Marketing",
                "Email Marketing",
                "Marketing Automation tools",
                "Adobe Photoshop, Canva (basic design)"));
        marketing.setSoftSkills(Arrays.asList(
                "Sáng tạo và tư duy đổi mới",
                "Phân tích dữ liệu và insights",
                "Giao tiếp và thuyết trình",
                "Làm việc nhóm đa chức năng",
                "Quản lý dự án và ngân sách",
                "Thích ứng với xu hướng mới"));
        marketing.setSuitableFor("Người có óc sáng tạo, năng động, thích khám phá xu hướng mới, " +
                "yêu thích mạng xã hội và công nghệ số. Phù hợp với những ai có kỹ năng giao tiếp tốt, " +
                "thích làm việc với nhiều người và có khả năng chịu áp lực về KPI.");

        marketing.setCareerPath(Arrays.asList(
                "Marketing Executive (0-2 năm)",
                "Marketing Specialist (2-4 năm)",
                "Brand Manager/Marketing Manager (4-7 năm)",
                "Marketing Director (7-10 năm)",
                "CMO/VP Marketing (10+ năm)"));
        marketing.setWorkEnvironments(Arrays.asList(
                "Agency Marketing và quảng cáo",
                "E-commerce và Retail",
                "Công ty công nghệ và Startup",
                "FMCG và hàng tiêu dùng",
                "Ngân hàng và dịch vụ",
                "Freelance và tư vấn độc lập"));

        marketing.setSalaryRange(
                "8 - 35 triệu/tháng. Fresher: 6-10 triệu, Executive: 10-15 triệu, Specialist: 15-25 triệu, Manager: 25-45 triệu, Director: 45-80 triệu+");
        marketing.setJobOpportunities("Nhu cầu rất cao, đặc biệt là Digital Marketing. " +
                "Mọi doanh nghiệp đều cần Marketing để tiếp cận khách hàng. Xu hướng chuyển đổi số " +
                "đang tạo ra hàng nghìn vị trí mới về Performance Marketing, Growth Hacking, Marketing Automation.");

        marketing.setChallenges(Arrays.asList(
                "Áp lực về KPI và doanh số",
                "Phải cập nhật xu hướng và công nghệ liên tục",
                "Cạnh tranh cao trong ngành",
                "Làm việc ngoài giờ khi có chiến dịch",
                "Cần đầu tư thời gian học hỏi công cụ mới",
                "Đôi khi phải làm việc với ngân sách hạn chế"));

        marketing.setSchools(Arrays.asList(
                "ĐH Kinh tế Quốc dân",
                "ĐH Ngoại thương",
                "ĐH Kinh tế TP.HCM",
                "ĐH RMIT",
                "ĐH Hoa Sen",
                "ĐH Kinh tế - Luật"));

        marketing.setRequiredSkills(
                Arrays.asList("Sáng tạo", "Phân tích dữ liệu", "Digital Marketing", "Content Writing", "SEO/SEM"));
        marketing.setMarketDemand("Cao - Đặc biệt Digital Marketing");

        majors.add(marketing);

        // Thiết kế đồ họa
        Major thietke = new Major("5", "Thiết kế đồ họa", "Nghệ thuật",
                "Ngành Thiết kế đồ họa đào tạo chuyên gia sáng tạo hình ảnh, truyền tải thông điệp qua các sản phẩm thị giác. "
                        +
                        "Sinh viên sẽ được học về tư duy thiết kế, nguyên lý thị giác, màu sắc, bố cục và sử dụng thành thạo các công cụ đồ họa 2D, 3D.");

        thietke.setHollandType("A"); // Artistic

        thietke.setEducationRequirement(
                "Tốt nghiệp THPT, có năng khiếu vẽ hoặc cảm thụ nghệ thuật tốt. Cần có tư duy sáng tạo, khả năng quan sát và yêu cái đẹp.");
        thietke.setTechnicalSkills(Arrays.asList(
                "Adobe Creative Suite (Photoshop, Illustrator, InDesign)",
                "Thiết kế giao diện UI/UX (Figma, XD)",
                "Thiết kế 3D (Blender, Maya, 3Ds Max)",
                "Nhiếp ảnh và chỉnh sửa ảnh",
                "Typography và dàn trang",
                "Kiến thức về in ấn và xuất bản",
                "Video Editing cơ bản (Premiere, After Effects)"));
        thietke.setSoftSkills(Arrays.asList(
                "Tư duy sáng tạo và phá cách",
                "Khả năng cảm thụ thẩm mỹ",
                "Giao tiếp và bảo vệ ý tưởng",
                "Làm việc chi tiết và tỉ mỉ",
                "Kiên nhẫn và chịu được áp lực sửa đổi",
                "Quản lý thời gian và deadline"));
        thietke.setSuitableFor("Người yêu thích cái đẹp, luôn có ý tưởng mới lạ, không thích sự gò bó, nhàm chán. " +
                "Phù hợp với những ai thích vẽ vời, quan sát cuộc sống và muốn thể hiện cá tính qua hình ảnh.");

        thietke.setCareerPath(Arrays.asList(
                "Junior Designer (0-2 năm): Thiết kế banner, poster, social post",
                "Senior Designer (2-5 năm): Lead dự án nhỏ, mentoring junior",
                "Art Director (5-8 năm): Định hướng nghệ thuật, concept",
                "Creative Director (8+ năm): Giám đốc sáng tạo toàn diện",
                "Freelance Designer chuyên nghiệp"));
        thietke.setWorkEnvironments(Arrays.asList(
                "Agency quảng cáo và truyền thông (Ogilvy, Dentsu...)",
                "Công ty thiết kế chuyên dụng",
                "Phòng Marketing của các doanh nghiệp",
                "Tòa soạn báo, tạp chí, nhà xuất bản",
                "Đài truyền hình, hãng phim",
                "Làm việc tự do (Freelance)"));
        thietke.setSalaryRange(
                "8 - 35 triệu/tháng. Junior: 8-12 triệu, Senior: 15-25 triệu, Art Director: 30-50 triệu+");
        thietke.setJobOpportunities("Nhu cầu rất cao trong kỷ nguyên số và truyền thông đa phương tiện. " +
                "Mọi công ty đều cần hình ảnh để quảng bá. Xu hướng UX/UI Design và Motion Graphics đang rất phát triển.");

        thietke.setChallenges(Arrays.asList(
                "Áp lực sáng tạo liên tục (Bí ý tưởng)",
                "Thường xuyên phải sửa chữa theo ý khách hàng/sếp",
                "Deadline gấp gáp",
                "Ngồi máy tính nhiều, ảnh hưởng sức khỏe (mắt, lưng)",
                "Công nghệ và xu hướng thiết kế thay đổi nhanh"));

        thietke.setSchools(Arrays.asList("ĐH Mỹ thuật Công nghiệp", "ĐH Kiến trúc", "ĐH RMIT", "ĐH FPT", "ĐH Văn Lang",
                "Arena Multimedia"));
        thietke.setRequiredSkills(Arrays.asList("Sáng tạo", "Photoshop/AI", "Tư duy thẩm mỹ", "UI/UX")); // Legacy
        thietke.setMarketDemand("Cao - Cạnh tranh về năng lực sáng tạo"); // Legacy
        majors.add(thietke);

        // Kế toán
        Major ketoan = new Major("6", "Kế toán", "Kinh tế",
                "Ngành Kế toán đào tạo về thu thập, xử lý, kiểm tra và cung cấp thông tin về tình hình tài chính " +
                        "của doanh nghiệp. Sinh viên sẽ nắm vững nghiệp vụ kế toán, thuế, kiểm toán và phân tích báo cáo tài chính.");

        ketoan.setHollandType("C"); // Conventional

        ketoan.setEducationRequirement(
                "Tốt nghiệp THPT, giỏi Toán. Cần tính cẩn thận, chi tiết, trung thực và yêu thích làm việc với các con số.");
        ketoan.setTechnicalSkills(Arrays.asList(
                "Nguyên lý kế toán và Kế toán doanh nghiệp",
                "Phần mềm kế toán (MISA, FAST, SAP)",
                "Luật Kế toán và Luật Thuế Việt Nam",
                "Lập và phân tích báo cáo tài chính",
                "Tin học văn phòng (Excel nâng cao)",
                "Kiểm toán căn bản",
                "Tiếng Anh chuyên ngành Kế toán"));
        ketoan.setSoftSkills(Arrays.asList(
                "Cẩn thận, tỉ mỉ và chính xác",
                "Trung thực và có đạo đức nghề nghiệp",
                "Chịu được áp lực công việc cao",
                "Kỹ năng tổ chức và quản lý thời gian",
                "Giao tiếp hiệu quả",
                "Làm việc nhóm"));
        ketoan.setSuitableFor("Người thích sự ngăn nắp, trật tự, làm việc theo quy trình. " +
                "Phù hợp với những ai cẩn thận, tỉ mỉ, có khả năng tập trung cao và chịu trách nhiệm tốt.");

        ketoan.setCareerPath(Arrays.asList(
                "Kế toán viên (Thanh toán, Công nợ, Kho, Thuế, Ngân hàng)",
                "Kế toán tổng hợp (General Accountant)",
                "Kế toán trưởng (Chief Accountant)",
                "Giám đốc tài chính (CFO)",
                "Kiểm toán viên (Auditor)"));
        ketoan.setWorkEnvironments(Arrays.asList(
                "Mọi loại hình doanh nghiệp (Sản xuất, Thương mại, Dịch vụ)",
                "Cơ quan nhà nước, đơn vị hành chính sự nghiệp",
                "Công ty Kiểm toán và Tư vấn thuế (Big 4: PwC, Deloitte, EY, KPMG)",
                "Ngân hàng và Tổ chức tài chính",
                "Tự nhận làm dịch vụ kế toán"));
        ketoan.setSalaryRange(
                "7 - 30 triệu/tháng. Fresher: 6-9 triệu, Chuyên viên: 10-20 triệu, Kế toán trưởng: 25-50 triệu+");
        ketoan.setJobOpportunities("Nhu cầu luôn ổn định vì mọi doanh nghiệp đều bắt buộc phải có kế toán. " +
                "Cơ hội thăng tiến lên Kế toán trưởng hoặc CFO rất rõ ràng nếu có năng lực.");

        ketoan.setChallenges(Arrays.asList(
                "Chịu trách nhiệm pháp lý cao về số liệu",
                "Áp lực cực lớn vào các kỳ báo cáo (cuối tháng, quý, năm)",
                "Phải cập nhật luật thuế liên tục",
                "Công việc lặp lại, có thể gây nhàm chán",
                "Ngồi nhiều, tiếp xúc máy tính liên tục"));

        ketoan.setSchools(Arrays.asList("ĐH Kinh tế Quốc dân", "ĐH Ngoại thương", "HV Tài chính", "ĐH Kinh tế TP.HCM",
                "ĐH Thương mại"));
        ketoan.setRequiredSkills(Arrays.asList("Tính toán", "Excel", "Luật thuế", "Phần mềm kế toán", "Cẩn thận")); // Legacy
        ketoan.setMarketDemand("Cao - Ổn định, cần ở mọi doanh nghiệp"); // Legacy
        majors.add(ketoan);

        // Y khoa
        Major ykhoa = new Major("7", "Y khoa (Bác sĩ đa khoa)", "Y dược",
                "Ngành Y khoa đào tạo Bác sĩ đa khoa có y đức, kiến thức khoa học cơ bản và y học cơ sở vững chắc, " +
                        "có kỹ năng lâm sàng và cộng đồng tốt để chẩn đoán, điều trị và phòng bệnh.");

        ykhoa.setHollandType("S"); // Social (kết hợp Investigative)

        ykhoa.setEducationRequirement(
                "Học lực xuất sắc, điểm thi khối B (Toán, Hóa, Sinh) rất cao. Cần sự kiên trì, bền bỉ, lòng nhân ái và sức khỏe tốt.");
        ykhoa.setTechnicalSkills(Arrays.asList(
                "Kiến thức Y học cơ sở và chuyên ngành (Nội, Ngoại, Sản, Nhi...)",
                "Kỹ năng chẩn đoán và ra quyết định lâm sàng",
                "Kỹ năng thủ thuật và phẫu thuật (tùy chuyên khoa)",
                "Sử dụng thiết bị y tế hiện đại",
                "Ngoại ngữ chuyên ngành Y (Anh/Pháp)",
                "Nghiên cứu khoa học y học",
                "Sơ cấp cứu"));
        ykhoa.setSoftSkills(Arrays.asList(
                "Y đức và thái độ phục vụ người bệnh",
                "Kỹ năng giao tiếp và thấu cảm",
                "Làm việc nhóm (Ekip mổ, hội chẩn)",
                "Chịu được áp lực cực cao",
                "Ra quyết định nhanh và chính xác",
                "Tự học suốt đời"));
        ykhoa.setSuitableFor("Những người có trí tuệ, lòng nhân ái, mong muốn cứu người. " +
                "Phù hợp với người chịu khó, không ngại vất vả, máu me, và sẵn sàng hy sinh thời gian cá nhân.");

        ykhoa.setCareerPath(Arrays.asList(
                "Bác sĩ thực tập (Intern)",
                "Bác sĩ nội trú (Resident Doctor)",
                "Bác sĩ chuyên khoa I, II",
                "Thạc sĩ, Tiến sĩ Y học",
                "Trưởng khoa/Giám đốc bệnh viện",
                "Giảng viên Y dược"));
        ykhoa.setWorkEnvironments(Arrays.asList(
                "Bệnh viện công lập và tư nhân",
                "Phòng khám đa khoa, chuyên khoa",
                "Viện nghiên cứu y học",
                "Các trường Đại học Y Dược",
                "Tổ chức y tế quốc tế (WHO, CDC...)"));
        ykhoa.setSalaryRange(
                "10 - 100 triệu+/tháng. Mới ra trường lương thấp, nhưng tăng cao theo tay nghề và danh tiếng. Bác sĩ giỏi có thu nhập rất cao.");
        ykhoa.setJobOpportunities(
                "Luôn thiếu hụt nhân lực chất lượng cao, đặc biệt ở tuyến cơ sở và các chuyên khoa khó. " +
                        "Cơ hội làm việc ổn định lâu dài và được xã hội trọng vọng.");

        ykhoa.setChallenges(Arrays.asList(
                "Thời gian đào tạo rất dài (6 năm + 3 năm nội trú...)",
                "Áp lực công việc cực lớn, trực đêm thường xuyên",
                "Môi trường làm việc có nguy cơ lây nhiễm bệnh",
                "Đối mặt với ranh giới sinh tử và áp lực từ người nhà bệnh nhân",
                "Phải học tập liên tục cả đời để cập nhật kiến thức"));

        ykhoa.setSchools(Arrays.asList("ĐH Y Hà Nội", "ĐH Y Dược TP.HCM", "ĐH Y khoa Phạm Ngọc Thạch", "HV Quân Y",
                "ĐH Y Dược Huế"));
        ykhoa.setRequiredSkills(
                Arrays.asList("Kiến thức y học", "Kỹ năng lâm sàng", "Y đức", "Tiếng Anh y khoa", "Chịu áp lực")); // Legacy
        ykhoa.setMarketDemand("Rất Cao - Ngành nghề thiết yếu, luôn khát nhân lực"); // Legacy
        majors.add(ykhoa);

        // Sư phạm Toán
        Major supham = new Major("8", "Sư phạm Toán", "Giáo dục",
                "Ngành Sư phạm Toán đào tạo giáo viên có kiến thức chuyên sâu về Toán học và kỹ năng sư phạm " +
                        "để giảng dạy Toán tại các trường phổ thông, cao đẳng, đại học.");

        supham.setHollandType("S"); // Social (kết hợp Investigative)

        supham.setEducationRequirement(
                "Học lực giỏi, yêu thích Toán học và công việc giảng dạy. Cần có khả năng truyền đạt tốt và kiên nhẫn.");
        supham.setTechnicalSkills(Arrays.asList(
                "Kiến thức Toán học chuyên sâu (Đại số, Hình học, Giải tích...)",
                "Phương pháp dạy học Toán",
                "Tâm lý học giáo dục",
                "Ứng dụng công nghệ thông tin trong dạy học",
                "Kỹ năng soạn giáo án và kiểm tra đánh giá",
                "Nghiên cứu khoa học giáo dục"));
        supham.setSoftSkills(Arrays.asList(
                "Kỹ năng giao tiếp và thuyết trình",
                "Kỹ năng quản lý lớp học",
                "Sự kiên nhẫn và thấu hiểu học sinh",
                "Kỹ năng giải quyết tình huống sư phạm",
                "Làm việc nhóm chuyên môn",
                "Tư duy logic"));
        supham.setSuitableFor(
                "Những người yêu trẻ, tâm huyết với nghề giáo, có tư duy toán học tốt và muốn truyền cảm hứng tri thức cho thế hệ sau. "
                        +
                        "Phù hợp với người thích môi trường mô phạm, ổn định.");

        supham.setCareerPath(Arrays.asList(
                "Giáo viên Toán (THCS, THPT)",
                "Giáo viên chủ nhiệm",
                "Tổ trưởng chuyên môn",
                "Ban giám hiệu (Hiệu phó, Hiệu trưởng)",
                "Chuyên viên Sở/Phòng Giáo dục",
                "Giảng viên Đại học (cần Thạc sĩ/Tiến sĩ)"));
        supham.setWorkEnvironments(Arrays.asList(
                "Các trường THCS, THPT công lập và tư thục",
                "Trường Quốc tế",
                "Trung tâm luyện thi, bồi dưỡng văn hóa",
                "Cơ quan quản lý giáo dục",
                "Các trường Cao đẳng, Đại học",
                "Tổ chức giáo dục trực tuyến (EdTech)"));
        supham.setSalaryRange(
                "7 - 25 triệu+/tháng. Lương nhà nước theo hệ số. Lương trường tư/quốc tế hoặc dạy thêm có thể rất cao.");
        supham.setJobOpportunities("Nhu cầu giáo viên Toán luôn cao vì đây là môn học chính. " +
                "Cơ hội dạy thêm và làm việc tại các trung tâm giáo dục rất lớn.");

        supham.setChallenges(Arrays.asList(
                "Áp lực từ phụ huynh và học sinh",
                "Áp lực thành tích và thi cử",
                "Thu nhập khởi điểm (công lập) chưa cao",
                "Phải soạn bài và chấm bài ngoài giờ lên lớp",
                "Đối mặt với các tình huống học đường phức tạp"));

        supham.setSchools(Arrays.asList("ĐH Sư phạm Hà Nội", "ĐH Sư phạm TP.HCM", "ĐH Giáo dục - ĐHQGHN", "ĐH Sài Gòn",
                "ĐH Sư phạm - ĐH Huế"));
        supham.setRequiredSkills(
                Arrays.asList("Toán học", "Kỹ năng sư phạm", "Giao tiếp", "Quản lý lớp học", "Kiên nhẫn")); // Legacy
        supham.setMarketDemand("Ổn định - Luôn cần thiết"); // Legacy
        majors.add(supham);

        // Kỹ thuật cơ khí
        Major cokhi = new Major("9", "Kỹ thuật cơ khí", "Kỹ thuật",
                "Ngành Kỹ thuật cơ khí trang bị kiến thức về thiết kế, chế tạo, vận hành và sửa chữa máy móc, thiết bị. "
                        +
                        "Đây là ngành nòng cốt của công nghiệp chế tạo máy và tự động hóa.");

        cokhi.setHollandType("R"); // Realistic

        cokhi.setEducationRequirement(
                "Tốt nghiệp THPT, học tốt môn Vật lý, Toán. Cần có tư duy kỹ thuật, thích máy móc và khả năng làm việc thực tế.");
        cokhi.setTechnicalSkills(Arrays.asList(
                "Vẽ kỹ thuật và CAD/CAM (AutoCAD, SolidWorks, Inventor)",
                "Công nghệ chế tạo máy (Tiện, Phay, CNC)",
                "Cơ học kỹ thuật và Sức bền vật liệu",
                "Thủy lực và Khí nén",
                "Tự động hóa quá trình sản xuất",
                "Bảo trì và sửa chữa máy móc",
                "Tiếng Anh kỹ thuật"));
        cokhi.setSoftSkills(Arrays.asList(
                "Tư duy logic và giải quyết vấn đề kỹ thuật",
                "Làm việc nhóm và phối hợp",
                "Cẩn thận và tuân thủ an toàn lao động",
                "Quản lý dự án kỹ thuật",
                "Khả năng đọc tài liệu kỹ thuật"));
        cokhi.setSuitableFor("Những người thích mày mò sửa chữa, lắp ráp, có sức khỏe tốt. " +
                "Phù hợp với ai đam mê công nghệ chế tạo, không ngại dầu mỡ, tiếng ồn máy móc.");

        cokhi.setCareerPath(Arrays.asList(
                "Kỹ sư thiết kế cơ khí (Design Engineer)",
                "Kỹ sư vận hành máy (Operation Engineer)",
                "Kỹ sư bảo trì (Maintenance Engineer)",
                "Quản lý sản xuất (Production Manager)",
                "Kỹ sư hệ thống (System Engineer)",
                "Giám đốc kỹ thuật (Technical Director)"));
        cokhi.setWorkEnvironments(Arrays.asList(
                "Nhà máy sản xuất (Ô tô, Xe máy, Điện tử...)",
                "Khu công nghiệp, chế xuất",
                "Công ty thiết kế kỹ thuật",
                "Công ty dầu khí, năng lượng",
                "Các viện nghiên cứu cơ khí"));
        cokhi.setSalaryRange(
                "9 - 30 triệu/tháng. Kỹ sư có tay nghề cao và tiếng Anh giỏi có thể nhận lương rất cao (1000$+).");
        cokhi.setJobOpportunities("Nhu cầu tuyển dụng rất lớn do Việt Nam đang đẩy mạnh công nghiệp hóa. " +
                "Đặc biệt thiếu kỹ sư cơ khí chất lượng cao biết vận hành máy CNC và thiết kế 3D.");

        cokhi.setChallenges(Arrays.asList(
                "Môi trường làm việc có thể ồn ào, bụi bặm (nhà xưởng)",
                "Tiềm ẩn nguy cơ tai nạn lao động nếu không tuân thủ an toàn",
                "Phải đứng máy hoặc đi công trình nhiều",
                "Công nghệ thay đổi, cần cập nhật liên tục các phần mềm thiết kế mới"));

        cokhi.setSchools(Arrays.asList("ĐH Bách Khoa Hà Nội", "ĐH Bách Khoa TP.HCM", "ĐH Sư phạm Kỹ thuật TP.HCM",
                "ĐH Công nghiệp", "ĐH Giao thông Vận tải"));
        cokhi.setRequiredSkills(
                Arrays.asList("Vẽ kỹ thuật", "CAD/CAM", "Vận hành máy", "Tư duy kỹ thuật", "An toàn lao động")); // Legacy
        cokhi.setMarketDemand("Cao - Cốt lõi của công nghiệp"); // Legacy
        majors.add(cokhi);

        // Kiến trúc
        Major kientruc = new Major("10", "Kiến trúc", "Nghệ thuật",
                "Ngành Kiến trúc đào tạo về thiết kế không gian, quy hoạch đô thị và kiến trúc công trình. " +
                        "Là sự kết hợp tinh tế giữa nghệ thuật và kỹ thuật, giữa thẩm mỹ và công năng.");

        kientruc.setHollandType("A"); // Artistic (kết hợp Realistic và Investigative)

        kientruc.setEducationRequirement(
                "Tốt nghiệp THPT, có năng khiếu vẽ mỹ thuật và tư duy không gian tốt. Cần am hiểu cả về kỹ thuật xây dựng và lịch sử nghệ thuật.");
        kientruc.setTechnicalSkills(Arrays.asList(
                "Vẽ tay và tư duy hình khối",
                "Phần mềm thiết kế 2D/3D (AutoCAD, Revit, SketchUp, 3Ds Max)",
                "Nguyên lý thiết kế kiến trúc và quy hoạch",
                "Kiến thức về kết cấu và vật liệu xây dựng",
                "Diễn họa kiến trúc (Indesign, Photoshop)",
                "Luật xây dựng và quy chuẩn thiết kế"));
        kientruc.setSoftSkills(Arrays.asList(
                "Tư duy sáng tạo và thẩm mỹ",
                "Kỹ năng thuyết trình và bảo vệ đồ án",
                "Làm việc nhóm (Teamwork với kỹ sư kết cấu, điện nước)",
                "Quan sát và phân tích không gian",
                "Quản lý dự án",
                "Chịu được áp lực cao"));
        kientruc.setSuitableFor("Những người bay bổng nhưng thực tế, yêu nghệ thuật nhưng giỏi tư duy logic. " +
                "Phù hợp với ai muốn để lại dấu ấn cá nhân qua các công trình xây dựng.");

        kientruc.setCareerPath(Arrays.asList(
                "Kiến trúc sư thiết kế (Design Architect)",
                "Kiến trúc sư triển khai (Technical Architect)",
                "Kiến trúc sư quy hoạch (Urban Planner)",
                "Kiến trúc sư nội thất (Interior Designer)",
                "Quản lý dự án xây dựng (Project Manager)",
                "Chủ trì thiết kế/Giám đốc công ty kiến trúc"));
        kientruc.setWorkEnvironments(Arrays.asList(
                "Văn phòng kiến trúc sư, Công ty tư vấn thiết kế",
                "Các tập đoàn bất động sản (Vingroup, Novaland...)",
                "Sở Quy hoạch Kiến trúc, Viện Quy hoạch",
                "Công ty thiết kế nội thất",
                "Làm việc tự do (Freelance Architect)"));
        kientruc.setSalaryRange(
                "10 - 40 triệu/tháng. Kiến trúc sư chủ trì hoặc có thương hiệu cá nhân có thu nhập rất cao theo dự án.");
        kientruc.setJobOpportunities("Nhu cầu cao theo sự phát triển của thị trường bất động sản và đô thị hóa. " +
                "Tuy nhiên cạnh tranh cũng rất gay gắt, đòi hỏi phải có phong cách riêng.");

        kientruc.setChallenges(Arrays.asList(
                "Thường xuyên phải thức đêm làm đồ án (lụt đồ án)",
                "Áp lực sáng tạo và kỹ thuật song hành",
                "Phải dung hòa giữa ý tưởng và yêu cầu của chủ đầu tư",
                "Chịu trách nhiệm về an toàn và thẩm mỹ của công trình",
                "Cần thời gian dài để khẳng định tên tuổi"));

        kientruc.setSchools(Arrays.asList("ĐH Kiến trúc Hà Nội", "ĐH Kiến trúc TP.HCM", "ĐH Xây dựng",
                "ĐH Bách Khoa (Khoa KT)", "ĐH Văn Lang"));
        kientruc.setRequiredSkills(
                Arrays.asList("Vẽ mỹ thuật", "Thiết kế 3D", "Tư duy không gian", "Sáng tạo", "AutoCAD/Revit")); // Legacy
        kientruc.setMarketDemand("Cao - Gắn liền với Bất động sản"); // Legacy
        majors.add(kientruc);

        // Trí tuệ nhân tạo (AI Engineer)
        Major ai = new Major("11", "Trí tuệ nhân tạo", "Công nghệ",
                "Ngành Trí tuệ nhân tạo (AI) tập trung nghiên cứu và phát triển các hệ thống máy tính có khả năng mô phỏng trí tuệ con người "
                        +
                        "như: học hỏi, suy luận, nhận biết hình ảnh, xử lý ngôn ngữ tự nhiên và giải quyết vấn đề.");

        ai.setHollandType("I"); // Investigative (kết hợp Realistic)

        ai.setEducationRequirement(
                "Yêu cầu nền tảng Toán học (Xác suất thống kê, Đại số tuyến tính) và Lập trình cực tốt. Tư duy logic, trừu tượng cao.");
        ai.setTechnicalSkills(Arrays.asList(
                "Machine Learning & Deep Learning (TensorFlow, PyTorch)",
                "Ngôn ngữ lập trình (Python, C++, R)",
                "Xử lý ngôn ngữ tự nhiên (NLP) & Computer Vision",
                "Toán học (Đại số, Giải tích, Thống kê)",
                "Big Data Technologies (Spark, Hadoop)",
                "Cloud Computing cho AI"));
        ai.setSoftSkills(Arrays.asList(
                "Tư duy giải quyết vấn đề phức tạp",
                "Khả năng tự học và nghiên cứu tài liệu tiếng Anh",
                "Tư duy phản biện",
                "Kiên nhẫn (khi huấn luyện mô hình)",
                "Kỹ năng làm việc nhóm"));
        ai.setSuitableFor(
                "Những người đam mê công nghệ, thích Toán học, có tư duy logic sắc bén và muốn tạo ra những sản phẩm thông minh thay đổi thế giới.");

        ai.setCareerPath(Arrays.asList(
                "AI/ML Engineer",
                "Data Scientist",
                "AI Researcher",
                "AI Product Manager",
                "Chief AI Officer (CAIO)"));
        ai.setWorkEnvironments(Arrays.asList(
                "Các tập đoàn công nghệ lớn (Google, Facebook, FPT.AI, VinBigData)",
                "Các công ty khởi nghiệp về AI",
                "Viện nghiên cứu và phòng thí nghiệm",
                "Ngân hàng và tổ chức tài chính (Fraud Detection)",
                "Y tế (Chẩn đoán hình ảnh)"));
        ai.setSalaryRange(
                "20 - 100 triệu+/tháng. Đây là một trong những ngành có mức lương cao nhất hiện nay. Fresher có thể đạt 15-20 triệu.");
        ai.setJobOpportunities(
                "Nhu cầu bùng nổ trên toàn cầu. Tại Việt Nam, nhân lực AI chất lượng cao đang cực kỳ khan hiếm.");
        ai.setChallenges(Arrays.asList(
                "Kiến thức khó và cập nhật cực nhanh",
                "Yêu cầu nền tảng Toán học vững chắc",
                "Cần máy móc cấu hình cao để làm việc",
                "Áp lực cạnh tranh với nhân sự toàn cầu"));
        ai.setSchools(Arrays.asList("ĐH Bách Khoa Hà Nội", "ĐH Công nghệ - ĐHQGHN", "ĐH Khoa học Tự nhiên",
                "ĐH CNTT - ĐHQG TP.HCM", "ĐH FPT"));
        ai.setRequiredSkills(Arrays.asList("Python", "Machine Learning", "Deep Learning", "Toán học", "Tiếng Anh")); // Legacy
        ai.setMarketDemand("Cực Cao - Xu hướng tương lai"); // Legacy
        majors.add(ai);

        // Kỹ sư dữ liệu (Data Engineer)
        Major data = new Major("12", "Kỹ sư dữ liệu", "Công nghệ",
                "Kỹ sư dữ liệu chịu trách nhiệm xây dựng, vận hành và tối ưu hóa hệ thống lưu trữ, xử lý dòng chảy dữ liệu (data pipelines) "
                        +
                        "để phục vụ cho việc phân tích và khai phá dữ liệu của doanh nghiệp.");

        data.setHollandType("C"); // Conventional (kết hợp Investigative)

        data.setEducationRequirement(
                "Tốt nghiệp các ngành CNTT, Hệ thống thông tin. Cần tư duy hệ thống, cẩn thận và hiểu biết sâu về CSDL.");
        data.setTechnicalSkills(Arrays.asList(
                "CSDL (SQL, NoSQL: MongoDB, Cassandra)",
                "Big Data (Hadoop, Spark, Kafka)",
                "Data Warehousing (Redshift, BigQuery, Snowflake)",
                "ETL Tools (Airflow, Talend)",
                "Lập trình (Python, Java, Scala)",
                "Cloud Platforms (AWS, Azure, GCP)"));
        data.setSoftSkills(Arrays.asList(
                "Tư duy hệ thống và cấu trúc",
                "Kỹ năng giải quyết sự cố",
                "Làm việc nhóm (với Data Scientist và Analyst)",
                "Cẩn thận và tỉ mỉ",
                "Quản lý thời gian"));
        data.setSuitableFor(
                "Người thích làm việc với các hệ thống lớn, thích tối ưu hóa, sắp xếp dữ liệu ngăn nắp và logic.");

        data.setCareerPath(Arrays.asList(
                "Junior Data Engineer",
                "Senior Data Engineer",
                "Data Architect",
                "Head of Data Infrastructure",
                "CTO"));
        data.setWorkEnvironments(Arrays.asList(
                "Công ty công nghệ, Thương mại điện tử (Tiki, Shopee)",
                "Ngân hàng, Fintech",
                "Tập đoàn viễn thông",
                "Công ty tư vấn giải pháp dữ liệu"));
        data.setSalaryRange(
                "15 - 60 triệu/tháng. Mức lương thường cao hơn mặt bằng chung ngành IT do tính chất chuyên biệt.");
        data.setJobOpportunities("Nhu cầu rất cao khi các doanh nghiệp chuyển đổi số và coi dữ liệu là tài sản.");
        data.setChallenges(Arrays.asList(
                "Làm việc với lượng dữ liệu khổng lồ, áp lực về hiệu năng hệ thống",
                "Phải trực hệ thống (On-call) khi có sự cố",
                "Công nghệ thay đổi liên tục",
                "Yêu cầu độ chính xác tuyệt đối"));
        data.setSchools(
                Arrays.asList("ĐH Bách Khoa", "ĐH Công nghệ", "HV Bưu chính Viễn thông", "ĐH Khoa học Tự nhiên"));
        data.setRequiredSkills(Arrays.asList("SQL", "Python", "Big Data", "ETL", "Cloud")); // Legacy
        data.setMarketDemand("Cao - Nhân lực khan hiếm"); // Legacy
        majors.add(data);

        // Kiểm thử phần mềm (Tester)
        Major tester = new Major("13", "Kiểm thử phần mềm", "Công nghệ",
                "Tester là người kiểm tra, tìm lỗi (bug) và đảm bảo chất lượng phần mềm trước khi đến tay người dùng. "
                        +
                        "Bao gồm kiểm thử thủ công (Manual) và tự động (Automation).");

        tester.setHollandType("C"); // Conventional (kết hợp Realistic)

        tester.setEducationRequirement(
                "Tốt nghiệp CNTT hoặc các khóa đào tạo Tester chuyên nghiệp. Cần tính cẩn thận, soi mói chi tiết và kiên nhẫn.");
        tester.setTechnicalSkills(Arrays.asList(
                "Kiến thức về quy trình kiểm thử (STLC)",
                "Viết Test Case, Test Plan",
                "SQL cơ bản",
                "Automation Tools (Selenium, Appium, Katalon) - Cho Automation Tester",
                "Lập trình cơ bản (Java, Python) - Cho Automation Tester",
                "Sử dụng công cụ quản lý lỗi (Jira, Bugzilla)",
                "API Testing (Postman)"));
        tester.setSoftSkills(Arrays.asList(
                "Tỉ mỉ, cẩn thận (Attention to detail)",
                "Tư duy phản biện (Critical Thinking)",
                "Giao tiếp (để báo cáo lỗi cho Dev)",
                "Kiên nhẫn",
                "Khả năng đặt mình vào vị trí người dùng"));
        tester.setSuitableFor(
                "Người cẩn thận, chi tiết, thích tìm tòi cái sai, có tính kiên trì. Phù hợp cho cả nam và nữ.");

        tester.setCareerPath(Arrays.asList(
                "Fresher Tester",
                "Junior Tester (Manual/Automation)",
                "Senior Tester/Test Leader",
                "Test Manager",
                "QA/QC Manager"));
        tester.setWorkEnvironments(Arrays.asList(
                "Công ty gia công phần mềm (Outsourcing)",
                "Công ty sản phẩm (Product)",
                "Bộ phận IT của ngân hàng, tập đoàn",
                "Làm việc tự do (Crowd Testing)"));
        tester.setSalaryRange(
                "8 - 40 triệu/tháng. Manual Tester: 8-20 triệu. Automation Tester lương cao hơn: 15-40 triệu.");
        tester.setJobOpportunities("Nhu cầu ổn định và cao. Bất kỳ dự án phần mềm nào cũng cần Tester.");
        tester.setChallenges(Arrays.asList(
                "Công việc lặp lại có thể nhàm chán (Manual)",
                "Đôi khi xảy ra xung đột với Developer",
                "Áp lực thời gian khi release sản phẩm",
                "Phải học code nếu muốn theo hướng Automation lương cao"));
        tester.setSchools(Arrays.asList("Các trường ĐH đạo tạo CNTT", "Các trung tâm đào tạo Tester chuyên nghiệp"));
        tester.setRequiredSkills(Arrays.asList("Test Case", "SQL", "Jira", "Automation", "Cẩn thận")); // Legacy
        tester.setMarketDemand("Cao - Ổn định"); // Legacy
        majors.add(tester);

        // Kỹ thuật Xây dựng
        Major xaydung = new Major("14", "Kỹ thuật xây dựng", "Kỹ thuật",
                "Ngành đào tạo kỹ sư có khả năng tư vấn, thiết kế, tổ chức thi công, quản lý giám sát và nghiệm thu các công trình xây dựng "
                        +
                        "như nhà ở, cầu đường, công trình thủy lợi, công nghiệp.");

        xaydung.setHollandType("R"); // Realistic

        xaydung.setEducationRequirement(
                "Giỏi các môn Tự nhiên (Toán, Lý). Cần sức khỏe tốt, chịu được áp lực công việc và sẵn sàng đi công trình xa.");
        xaydung.setTechnicalSkills(Arrays.asList(
                "Vẽ kỹ thuật và đọc bản vẽ",
                "Phần mềm thiết kế (AutoCAD, Revit, SAP2000, Etabs)",
                "Trắc địa và đo đạc",
                "Kỹ thuật thi công và an toàn lao động",
                "Dự toán và quản lý chi phí",
                "Luật xây dựng"));
        xaydung.setSoftSkills(Arrays.asList(
                "Kỹ năng quản lý và tổ chức",
                "Làm việc nhóm và điều phối",
                "Giao tiếp và đàm phán",
                "Chịu được áp lực cao",
                "Thích nghi môi trường"));
        xaydung.setSuitableFor(
                "Người có sức khỏe, thích làm việc thực tế, thích nhìn thấy thành quả công việc hiện hữu. Chấp nhận đi lại nhiều.");

        xaydung.setCareerPath(Arrays.asList(
                "Kỹ sư giám sát/Kỹ sư thiết kế",
                "Chỉ huy trưởng công trình",
                "Quản lý dự án (Project Manager)",
                "Giám đốc dự án/Giám đốc kỹ thuật",
                "Chủ doanh nghiệp xây dựng"));
        xaydung.setWorkEnvironments(Arrays.asList(
                "Công trường xây dựng",
                "Văn phòng tư vấn thiết kế",
                "Ban quản lý dự án",
                "Các cơ quan quản lý nhà nước về xây dựng",
                "Viện nghiên cứu"));
        xaydung.setSalaryRange(
                "10 - 50 triệu/tháng. Kỹ sư mới ra trường: 8-12 triệu. Chỉ huy trưởng/Quản lý dự án lương rất cao.");
        xaydung.setJobOpportunities(
                "Nhu cầu xây dựng hạ tầng, đô thị hóa luôn cao. Có thể làm việc trong nước hoặc xuất khẩu lao động (Nhật, Hàn).");
        xaydung.setChallenges(Arrays.asList(
                "Công việc vất vả, dầm mưa dãi nắng",
                "Thường xuyên phải đi công tác xa nhà",
                "Môi trường làm việc tiềm ẩn nguy hiểm",
                "Áp lực tiến độ và chất lượng công trình"));
        xaydung.setSchools(
                Arrays.asList("ĐH Xây dựng", "ĐH Kiến trúc", "ĐH Bách Khoa", "ĐH Giao thông Vận tải", "ĐH Thủy lợi"));
        xaydung.setRequiredSkills(Arrays.asList("Đọc bản vẽ", "AutoCAD", "Giám sát", "Dự toán", "Sức khỏe tốt")); // Legacy
        xaydung.setMarketDemand("Cao - Theo đà phát triển đô thị"); // Legacy
        majors.add(xaydung);

        // Kỹ thuật Điện - Điện tử
        Major diente = new Major("15", "Kỹ thuật điện - điện tử", "Kỹ thuật",
                "Ngành học về điện, điện tử và điện từ, với nhiều chuyên ngành nhỏ như năng lượng, điện tử học, hệ thống điều khiển, xử lý tín hiệu, viễn thông.");

        diente.setHollandType("R"); // Realistic (kết hợp Investigative)

        diente.setEducationRequirement(
                "Giỏi Toán, Lý. Tư duy logic tốt, thích tìm hiểu về mạch điện, thiết bị điện tử.");
        diente.setTechnicalSkills(Arrays.asList(
                "Thiết kế mạch điện tử (Altium, Proteus)",
                "Lập trình vi điều khiển/nhúng (C/C++, Arduino, STM32)",
                "PLC và tự động hóa công nghiệp",
                "IoT (Internet of Things)",
                "An toàn điện",
                "Đo lường và điều khiển"));
        diente.setSoftSkills(Arrays.asList(
                "Tư duy phân tích và giải quyết vấn đề",
                "Làm việc nhóm",
                "Cẩn thận và tỉ mỉ",
                "Khả năng tự học công nghệ mới",
                "Tiếng Anh kỹ thuật"));
        diente.setSuitableFor(
                "Người yêu thích máy móc, mạch điện, robot. Thích tìm hiểu nguyên lý hoạt động của các thiết bị điện tử.");

        diente.setCareerPath(Arrays.asList(
                "Kỹ sư thiết kế mạch/điện",
                "Kỹ sư vận hành bảo trì",
                "Kỹ sư hệ thống/Tự động hóa",
                "Trưởng phòng kỹ thuật",
                "Giám đốc kỹ thuật nhà máy"));
        diente.setWorkEnvironments(Arrays.asList(
                "Các nhà máy sản xuất linh kiện điện tử (Samsung, LG, Intel)",
                "Nhà máy điện, công ty truyền tải điện (EVN)",
                "Công ty giải pháp tự động hóa",
                "Công ty viễn thông (Viettel, VNPT)",
                "Trung tâm R&D"));
        diente.setSalaryRange("10 - 40 triệu/tháng. Ngành vi mạch bán dẫn (IC Design) lương rất cao.");
        diente.setJobOpportunities(
                "Rất lớn, đặc biệt là trong lĩnh vực sản xuất chip, bán dẫn và IoT đang được đầu tư mạnh tại Việt Nam.");
        diente.setChallenges(Arrays.asList(
                "Kiến thức rộng và khó",
                "Công nghệ thay đổi nhanh",
                "Tiếp xúc với điện nguy hiểm",
                "Cần sự chính xác cao"));
        diente.setSchools(
                Arrays.asList("ĐH Bách Khoa", "ĐH Sư phạm Kỹ thuật", "HV Bưu chính Viễn thông", "ĐH Công nghiệp"));
        diente.setRequiredSkills(Arrays.asList("Thiết kế mạch", "Vi điều khiển", "PLC", "Tiếng Anh", "Tư duy logic")); // Legacy
        diente.setMarketDemand("Rất Cao - Đặc biệt là bán dẫn"); // Legacy
        majors.add(diente);

        // Sư phạm Vật lý
        Major suphamLy = new Major("16", "Sư phạm Vật lý", "Giáo dục",
                "Đào tạo giáo viên giảng dạy môn Vật lý tại các trường phổ thông, trang bị kiến thức chuyên sâu về Vật lý và kỹ năng sư phạm.");
        suphamLy.setHollandType("S"); // Social (kết hợp Investigative)
        suphamLy.setEducationRequirement(
                "Yêu thích Vật lý và công việc giảng dạy. Có khả năng diễn đạt các hiện tượng vật lý một cách dễ hiểu.");
        suphamLy.setTechnicalSkills(Arrays.asList("Kiến thức Vật lý đại cương và chuyên sâu", "Thí nghiệm Vật lý",
                "Phương pháp dạy học", "Soạn giáo án điện tử"));
        suphamLy.setSoftSkills(Arrays.asList("Giao tiếp", "Thuyết trình", "Kiên nhẫn", "Quản lý lớp học"));
        suphamLy.setSuitableFor("Người yêu thích khoa học tự nhiên và muốn truyền lửa đam mê cho học sinh.");
        suphamLy.setCareerPath(
                Arrays.asList("Giáo viên", "Tổ trưởng chuyên môn", "Hiệu trưởng", "Nhà nghiên cứu giáo dục"));
        suphamLy.setWorkEnvironments(
                Arrays.asList("Trường THCS, THPT", "Trường Quốc tế", "Trung tâm luyện thi", "Viện nghiên cứu"));
        suphamLy.setSalaryRange("7 - 20 triệu+/tháng");
        suphamLy.setJobOpportunities("Ổn định tại các trường học.");
        suphamLy.setChallenges(Arrays.asList("Áp lực thành tích", "Môn học khó, học sinh dễ chán nếu không dạy hay"));
        suphamLy.setSchools(Arrays.asList("ĐH Sư phạm HN/HCM", "ĐH Giáo dục"));
        suphamLy.setRequiredSkills(Arrays.asList("Vật lý", "Sư phạm", "Thí nghiệm", "Giao tiếp"));
        suphamLy.setMarketDemand("Ổn định");
        majors.add(suphamLy);

        // Sư phạm Hóa học
        Major suphamHoa = new Major("17", "Sư phạm Hóa học", "Giáo dục",
                "Đào tạo giáo viên giảng dạy môn Hóa học. Kết hợp giữa lý thuyết và thực hành thí nghiệm hóa học.");
        suphamHoa.setHollandType("S"); // Social (kết hợp Investigative)
        suphamHoa.setEducationRequirement("Yêu thích Hóa học và thí nghiệm. Cẩn thận, tỉ mỉ.");
        suphamHoa.setTechnicalSkills(Arrays.asList("Kiến thức Hóa học (Vô cơ, Hữu cơ, Phân tích)",
                "Kỹ năng thực hành thí nghiệm an toàn", "Phương pháp dạy học"));
        suphamHoa.setSoftSkills(Arrays.asList("Giao tiếp", "Quan sát", "Cẩn thận", "Giải quyết tình huống"));
        suphamHoa.setSuitableFor("Người yêu thích các phản ứng hóa học, cẩn thận và thích giảng dạy.");
        suphamHoa.setCareerPath(Arrays.asList("Giáo viên", "Quản lý phòng thí nghiệm", "Chuyên viên giáo dục"));
        suphamHoa.setWorkEnvironments(
                Arrays.asList("Trường học", "Trung tâm thí nghiệm", "Công ty hóa chất (nếu không đi dạy)"));
        suphamHoa.setSalaryRange("7 - 20 triệu+/tháng");
        suphamHoa.setJobOpportunities("Ổn định. Có thể làm thêm trong các ngành liên quan đến kiểm nghiệm.");
        suphamHoa.setChallenges(Arrays.asList("Tiếp xúc hóa chất độc hại", "Áp lực an toàn thí nghiệm"));
        suphamHoa.setSchools(Arrays.asList("ĐH Sư phạm HN/HCM", "ĐH Khoa học Tự nhiên (cần chứng chỉ SP)"));
        suphamHoa.setRequiredSkills(Arrays.asList("Hóa học", "Thí nghiệm", "Sư phạm", "An toàn"));
        suphamHoa.setMarketDemand("Ổn định");
        majors.add(suphamHoa);

        // Sư phạm Tiếng Anh
        Major suphamAnh = new Major("18", "Sư phạm Tiếng Anh", "Giáo dục",
                "Đào tạo giáo viên giảng dạy Tiếng Anh. Trang bị năng lực ngôn ngữ chuẩn và phương pháp giảng dạy hiện đại (TESOL, CELTA...).");
        suphamAnh.setHollandType("S"); // Social (kết hợp Artistic)
        suphamAnh.setEducationRequirement("Năng khiếu ngoại ngữ, phát âm chuẩn. Tự tin, năng động.");
        suphamAnh.setTechnicalSkills(Arrays.asList("4 kỹ năng Nghe-Nói-Đọc-Viết thành thạo (C1/C2)",
                "Phương pháp giảng dạy ngoại ngữ", "Tâm lý học", "Công nghệ trong dạy học"));
        suphamAnh.setSoftSkills(
                Arrays.asList("Giao tiếp xuất sắc", "Truyền cảm hứng", "Hài hước", "Thích nghi văn hóa"));
        suphamAnh.setSuitableFor(
                "Người hoạt ngôn, yêu thích ngôn ngữ và văn hóa nước ngoài, thích tương tác với mọi người.");
        suphamAnh.setCareerPath(
                Arrays.asList("Giáo viên", "Giảng viên", "Phiên dịch viên", "Quản lý trung tâm ngoại ngữ"));
        suphamAnh.setWorkEnvironments(
                Arrays.asList("Trường học các cấp", "Trung tâm Anh ngữ", "Trường Quốc tế", "Doanh nghiệp đa quốc gia"));
        suphamAnh.setSalaryRange("10 - 40 triệu+/tháng. Thu nhập rất cao nếu dạy trung tâm hoặc dạy kèm.");
        suphamAnh.setJobOpportunities("Rất cao. Tiếng Anh là kỹ năng bắt buộc trong thời đại mới.");
        suphamAnh.setChallenges(Arrays.asList("Cạnh tranh cao", "Phải nói nhiều, giữ năng lượng cao liên tục"));
        suphamAnh.setSchools(Arrays.asList("ĐH Ngoại ngữ - ĐHQGHN", "ĐH Sư phạm TP.HCM", "ĐH Hà Nội"));
        suphamAnh.setRequiredSkills(Arrays.asList("Tiếng Anh C1/C2", "Sư phạm", "Giao tiếp", "TESOL"));
        suphamAnh.setMarketDemand("Rất Cao");
        majors.add(suphamAnh);

        // Logistics & Chuỗi cung ứng
        Major logistics = new Major("19", "Logistics & Chuỗi cung ứng", "Kinh tế",
                "Quản lý dòng di chuyển của hàng hóa, thông tin và tài chính từ nơi sản xuất đến tay người tiêu dùng. Bao gồm vận tải, kho bãi, xuất nhập khẩu, mua hàng.");
        logistics.setHollandType("E"); // Enterprising (kết hợp Conventional)
        logistics.setEducationRequirement("Tư duy tổ chức, giỏi ngoại ngữ. Năng động, chịu được áp lực.");
        logistics.setTechnicalSkills(Arrays.asList("Nghiệp vụ Xuất nhập khẩu (Incoterms)", "Quản lý kho bãi & tồn kho",
                "Phần mềm ERP/Logistics", "Tiếng Anh thương mại", "Luật thương mại quốc tế"));
        logistics.setSoftSkills(Arrays.asList("Kỹ năng đàm phán", "Giải quyết vấn đề (Problem solving)",
                "Quản lý thời gian", "Chịu áp lực cao"));
        logistics.setSuitableFor("Người năng động, linh hoạt, thích di chuyển, giao tiếp tốt và có tư duy sắp xếp.");
        logistics.setCareerPath(Arrays.asList("Nhân viên chứng từ/hiện trường", "Chuyên viên mua hàng (Purchasing)",
                "Quản lý kho", "Trưởng phòng Logistics", "Giám đốc chuỗi cung ứng"));
        logistics.setWorkEnvironments(Arrays.asList("Công ty giao nhận (Forwarder)", "Kho bãi, Cảng biển, Sân bay",
                "Bộ phận XNK của doanh nghiệp sản xuất", "Sàn TMĐT"));
        logistics.setSalaryRange("8 - 30 triệu/tháng. Cấp quản lý lương rất cao.");
        logistics.setJobOpportunities("Nhu cầu tăng mạnh nhờ sự bùng nổ của Thương mại điện tử và xuất nhập khẩu.");
        logistics.setChallenges(Arrays.asList("Áp lực thời gian (hàng về trễ, kẹt cảng)", "Làm việc trái múi giờ",
                "Thủ tục hải quan phức tạp"));
        logistics.setSchools(Arrays.asList("ĐH Ngoại thương", "ĐH Giao thông Vận tải", "ĐH Kinh tế TP.HCM", "RMIT"));
        logistics.setRequiredSkills(Arrays.asList("Xuất nhập khẩu", "Tiếng Anh", "Quản lý kho", "Đàm phán"));
        logistics.setMarketDemand("Cao - Xu hướng toàn cầu hóa");
        majors.add(logistics);

        // Fintech (Công nghệ tài chính)
        Major fintech = new Major("20", "Fintech", "Kinh tế",
                "Giao thoa giữa Tài chính và Công nghệ. Sử dụng công nghệ để đổi mới và tối ưu hóa các dịch vụ tài chính như thanh toán, ngân hàng số, đầu tư, blockchain.");
        fintech.setHollandType("E"); // Enterprising (kết hợp Investigative)
        fintech.setEducationRequirement("Hiểu biết cả về Tài chính và CNTT. Tư duy logic và nhạy bén với thị trường.");
        fintech.setTechnicalSkills(Arrays.asList("Kiến thức Tài chính - Ngân hàng", "Lập trình (Python, Java) cơ bản",
                "Blockchain & Crypto", "Phân tích dữ liệu tài chính", "Bảo mật thông tin"));
        fintech.setSoftSkills(
                Arrays.asList("Tư duy đổi mới sáng tạo", "Phân tích rủi ro", "Khả năng thích nghi nhanh", "Giao tiếp"));
        fintech.setSuitableFor(
                "Người yêu thích công nghệ và tài chính, muốn làm việc trong môi trường năng động, thay đổi nhanh.");
        fintech.setCareerPath(Arrays.asList("Chuyên viên phát triển sản phẩm Fintech", "Business Analyst (Fintech)",
                "Blockchain Developer", "Chuyên viên quản trị rủi ro số", "Giám đốc Fintech"));
        fintech.setWorkEnvironments(Arrays.asList("Ngân hàng số", "Ví điện tử (Momo, ZaloPay)",
                "Sàn giao dịch chứng khoán/Crypto", "Công ty bảo hiểm công nghệ (Insurtech)"));
        fintech.setSalaryRange("15 - 50 triệu/tháng. Ngành mới nên lương rất cạnh tranh để thu hút nhân tài.");
        fintech.setJobOpportunities("Rất tiềm năng. Là xu hướng tất yếu của ngành tài chính ngân hàng.");
        fintech.setChallenges(
                Arrays.asList("Khung pháp lý chưa hoàn thiện", "Rủi ro bảo mật cao", "Cạnh tranh khốc liệt"));
        fintech.setSchools(Arrays.asList("ĐH Kinh tế Quốc dân", "ĐH Bách Khoa (đào tạo tech)",
                "Viện Công nghệ Ngân hàng", "ĐH Quốc tế"));
        fintech.setRequiredSkills(Arrays.asList("Tài chính", "Công nghệ", "Blockchain", "Phân tích dữ liệu"));
        fintech.setMarketDemand("Cao - Xu hướng mới");
        majors.add(fintech);

        // Răng - Hàm - Mặt
        Major rhm = new Major("21", "Răng - Hàm - Mặt", "Y dược",
                "Đào tạo bác sĩ chuyên sâu về chẩn đoán, điều trị và thẩm mỹ các vấn đề liên quan đến răng, hàm, mặt.");
        rhm.setHollandType("I"); // Investigative (kết hợp Social & Realistic)
        rhm.setEducationRequirement(
                "Điểm chuẩn rất cao (tương đương Y đa khoa). Cần sự khéo léo tuyệt đối của đôi tay, mắt thẩm mỹ và sự tỉ mỉ.");
        rhm.setTechnicalSkills(Arrays.asList("Kỹ thuật nha khoa phục hình", "Chỉnh nha (Niềng răng)",
                "Phẫu thuật hàm mặt", "Cấy ghép Implant", "Sử dụng thiết bị nha khoa công nghệ cao"));
        rhm.setSoftSkills(Arrays.asList("Giao tiếp trấn an bệnh nhân", "Sự tập trung cao độ", "Kiên nhẫn", "Y đức"));
        rhm.setSuitableFor(
                "Người khéo tay, sạch sẽ, tỉ mỉ, thích làm việc độc lập và mang lại nụ cười đẹp cho người khác.");
        rhm.setCareerPath(Arrays.asList("Bác sĩ RHM", "Bác sĩ phẫu thuật hàm mặt", "Chuyên gia thẩm mỹ nụ cười",
                "Chủ phòng khám nha khoa"));
        rhm.setWorkEnvironments(Arrays.asList("Bệnh viện RHM", "Khoa RHM bệnh viện đa khoa",
                "Phòng khám nha khoa tư nhân", "Nghiên cứu & Giảng dạy"));
        rhm.setSalaryRange("15 - 80 triệu+/tháng. Thu nhập rất hấp dẫn, đặc biệt là nha khoa thẩm mỹ.");
        rhm.setJobOpportunities("Rất cao do nhu cầu chăm sóc răng miệng và thẩm mỹ ngày càng tăng.");
        rhm.setChallenges(
                Arrays.asList("Rủi ro nghề nghiệp (lây nhiễm)", "Áp lực cao", "Đau lưng/mỏi mắt do tư thế làm việc"));
        rhm.setSchools(Arrays.asList("ĐH Y Hà Nội", "ĐH Y Dược TP.HCM", "ĐH Răng Hàm Mặt"));
        rhm.setRequiredSkills(Arrays.asList("Khéo tay", "Kiến thức nha khoa", "Thẩm mỹ", "Tiếng Anh"));
        rhm.setMarketDemand("Rất Cao");
        majors.add(rhm);

        // Điều dưỡng
        Major dieuduong = new Major("22", "Điều dưỡng", "Y dược",
                "Ngành Điều dưỡng đào tạo đội ngũ nhân viên y tế có nhiệm vụ chăm sóc, theo dõi sức khỏe và hỗ trợ bệnh nhân trong suốt quá trình điều trị.");
        dieuduong.setHollandType("S"); // Social
        dieuduong.setEducationRequirement("Cần lòng nhân ái, sự nhẫn nại và sức khỏe tốt. Không sợ máu và chất thải.");
        dieuduong.setTechnicalSkills(Arrays.asList("Kỹ thuật chăm sóc người bệnh", "Sơ cấp cứu",
                "Sử dụng máy móc y tế cơ bản", "Quản lý hồ sơ bệnh án", "Tiêm truyền/Lấy thuốc"));
        dieuduong
                .setSoftSkills(Arrays.asList("Empathy (Thấu cảm)", "Giao tiếp ân cần", "Chịu áp lực", "Làm việc nhóm"));
        dieuduong.setSuitableFor("Những người thích chăm sóc người khác, hiền lành, chịu khó và chu đáo.");
        dieuduong.setCareerPath(Arrays.asList("Điều dưỡng viên", "Điều dưỡng trưởng", "Giảng viên điều dưỡng",
                "Chăm sóc sức khỏe tại gia (Home Care)"));
        dieuduong.setWorkEnvironments(Arrays.asList("Bệnh viện", "Trạm y tế", "Viện dưỡng lão", "Phòng khám tư",
                "Xuất khẩu lao động (Nhật, Đức)"));
        dieuduong.setSalaryRange("7 - 25 triệu/tháng. Đi xuất khẩu lao động lương rất cao (40-60 triệu).");
        dieuduong
                .setJobOpportunities("Rất lớn, đặc biệt là cơ hội đi làm việc tại nước ngoài nơi dân số đang già hóa.");
        dieuduong.setChallenges(Arrays.asList("Trực đêm vất vả", "Công việc nặng nhọc (nâng đỡ bệnh nhân)",
                "Áp lực từ người nhà bệnh nhân"));
        dieuduong.setSchools(
                Arrays.asList("ĐH Điều dưỡng Nam Định", "ĐH Y Hà Nội", "ĐH Y Dược TP.HCM", "Các trường Cao đẳng Y tế"));
        dieuduong.setRequiredSkills(Arrays.asList("Chăm sóc bệnh nhân", "Tiêm truyền", "Giao tiếp", "Kiên nhẫn"));
        dieuduong.setMarketDemand("Cao - Đặc biệt là XKLĐ");
        majors.add(dieuduong);

        // Tâm lý học (Psychology)
        Major tamly = new Major("23", "Tâm lý học", "Xã hội",
                "Nghiên cứu về hành vi và tâm trí con người. Áp dụng kiến thức tâm lý để tham vấn, trị liệu và giải quyết các vấn đề sức khỏe tinh thần.");
        tamly.setHollandType("S"); // Social (kết hợp Investigative)
        tamly.setEducationRequirement(
                "Cần sự tinh tế, nhạy cảm, biết lắng nghe và không phán xét. Tư duy logic và cảm xúc cân bằng.");
        tamly.setTechnicalSkills(Arrays.asList("Các liệu pháp tâm lý (CBT, Phân tâm...)",
                "Đánh giá và trắc nghiệm tâm lý", "Kỹ năng tham vấn (Counseling)", "Nghiên cứu hành vi"));
        tamly.setSoftSkills(
                Arrays.asList("Lắng nghe tích cực", "Thấu cảm", "Bảo mật thông tin", "Quản lý cảm xúc cá nhân"));
        tamly.setSuitableFor(
                "Người thích lắng nghe tâm tư người khác, muốn giúp đỡ mọi người vượt qua khủng hoảng tinh thần.");
        tamly.setCareerPath(Arrays.asList("Chuyên viên tham vấn tâm lý học đường",
                "Nhà trị liệu tâm lý (Psychotherapist)", "Chuyên viên nhân sự (HR)", "Nhà nghiên cứu tâm lý"));
        tamly.setWorkEnvironments(Arrays.asList("Trường học", "Bệnh viện (Khoa tâm lý)", "Trung tâm tham vấn",
                "Doanh nghiệp", "Tổ chức NGO"));
        tamly.setSalaryRange("8 - 30 triệu/tháng. Chuyên gia trị liệu giỏi tính phí theo giờ (1-3 triệu/giờ).");
        tamly.setJobOpportunities(
                "Đang tăng nhanh do xã hội ngày càng quan tâm đến sức khỏe tinh thần (Mental Health).");
        tamly.setChallenges(Arrays.asList("Dễ bị ảnh hưởng cảm xúc tiêu cực từ thân chủ (Burnout)",
                "Cần học lên cao (Thạc sĩ/Tiến sĩ) để hành nghề trị liệu chuyên sâu"));
        tamly.setSchools(Arrays.asList("ĐH KHXH&NV", "ĐH Sư phạm", "ĐH Giáo dục"));
        tamly.setRequiredSkills(Arrays.asList("Tham vấn", "Lắng nghe", "Trắc nghiệm tâm lý", "Tiếng Anh"));
        tamly.setMarketDemand("Tăng trưởng mạnh");
        majors.add(tamly);

        // Kỹ thuật Y sinh (Biomedical Engineering)
        Major ysinh = new Major("24", "Kỹ thuật Y sinh", "Kỹ thuật",
                "Ứng dụng kỹ thuật và công nghệ vào y học để chế tạo thiết bị y tế, chân tay giả, và các giải pháp chẩn đoán điều trị hiện đại.");
        ysinh.setHollandType("I"); // Investigative (kết hợp Realistic)
        ysinh.setEducationRequirement("Giỏi Toán, Lý, Sinh. Yêu thích cả y học và máy móc công nghệ.");
        ysinh.setTechnicalSkills(Arrays.asList("Điện tử y sinh", "Xử lý tín hiệu số", "Vật liệu sinh học",
                "Vận hành & bảo trì thiết bị y tế (Máy chụp CT, MRI, X-Quang)"));
        ysinh.setSoftSkills(Arrays.asList("Tư duy liên ngành", "Làm việc nhóm (với bác sĩ và kỹ sư)", "Cẩn thận"));
        ysinh.setSuitableFor("Người đam mê công nghệ nhưng muốn đóng góp cho ngành y tế cứu người.");
        ysinh.setCareerPath(Arrays.asList("Kỹ sư thiết bị y tế", "Kỹ sư ứng dụng (Application Specialist)",
                "Chuyên viên quản lý thiết bị bệnh viện", "Nghiên cứu viên"));
        ysinh.setWorkEnvironments(
                Arrays.asList("Công ty thiết bị y tế (GE, Siemens, Philips)", "Bệnh viện", "Viện nghiên cứu"));
        ysinh.setSalaryRange("10 - 35 triệu/tháng. Lương khá cao tại các hãng thiết bị nước ngoài.");
        ysinh.setJobOpportunities("Cơ hội tốt tại các hãng thiết bị y tế lớn và các bệnh viện hiện đại.");
        ysinh.setChallenges(Arrays.asList("Ngành hẹp, đòi hỏi kiến thức sâu", "Công nghệ thay đổi nhanh"));
        ysinh.setSchools(Arrays.asList("ĐH Bách Khoa", "ĐH Quốc tế - ĐHQG TP.HCM", "ĐH Phenikaa"));
        ysinh.setRequiredSkills(Arrays.asList("Thiết bị y tế", "Điện tử", "Tiếng Anh", "Sinh học"));
        ysinh.setMarketDemand("Tiềm năng");
        majors.add(ysinh);

        // Lập trình Web
        Major web = new Major("25", "Lập trình Web", "Công nghệ",
                "Xây dựng và phát triển các website và ứng dụng web. Bao gồm Frontend (giao diện), Backend (xử lý dữ liệu) hoặc Fullstack.");
        web.setHollandType("S"); // Sửa lại thành C hoặc R hoặc I? Thường là I hoặc C. Để C (Conventional) hoặc
                                 // I. Để R/I/C. Chọn I (Investigative) đại diện.
        // Thực tế Holland của Dev là I-R-C.
        web.setHollandType("R"); // Realistic - Làm việc với công cụ
        web.setEducationRequirement("Tư duy logic tốt. Có thể học Đại học hoặc các khóa nghề chuyên sâu.");
        web.setTechnicalSkills(
                Arrays.asList("HTML/CSS/JavaScript (Cốt lõi)", "Frontend Frameworks (React, Vue, Angular)",
                        "Backend (Node.js, Java, PHP, Go)", "Database (MySQL, PostgreSQL)", "Git"));
        web.setSoftSkills(Arrays.asList("Tự học (Self-learning)", "Giải quyết vấn đề", "Làm việc nhóm (Scrum/Agile)",
                "Chú ý chi tiết"));
        web.setSuitableFor("Người thích công nghệ, thích tạo ra sản phẩm chạy trên trình duyệt, có tư duy logic.");
        web.setCareerPath(
                Arrays.asList("Junior Dev", "Senior Dev", "Tech Lead", "Software Architect", "Engineering Manager"));
        web.setWorkEnvironments(Arrays.asList("Công ty Outsourcing", "Công ty Product", "Freelance", "Startups"));
        web.setSalaryRange("10 - 50 triệu+/tháng. Rất đa dạng tùy năng lực.");
        web.setJobOpportunities("Rất lớn. Hầu hết mọi doanh nghiệp đều cần website/webapp.");
        web.setChallenges(
                Arrays.asList("Công nghệ web thay đổi chóng mặt (Framework mới liên tục)", "Ngồi máy tính nhiều"));
        web.setSchools(Arrays.asList("FPT Aptech", "ĐH FPT", "Các trường CNTT", "Tự học online"));
        web.setRequiredSkills(Arrays.asList("JavaScript", "React/Vue", "NodeJS", "SQL", "Git"));
        web.setMarketDemand("Rất Cao");
        majors.add(web);

        // Lập trình Mobile
        Major mobile = new Major("26", "Lập trình Mobile", "Công nghệ",
                "Phát triển ứng dụng cho các thiết bị di động (Smartphone, Tablet) trên nền tảng Android và iOS.");
        mobile.setHollandType("R"); // Realistic
        mobile.setEducationRequirement("Tư duy logic, yêu thích các thiết bị di động.");
        mobile.setTechnicalSkills(Arrays.asList("Android (Kotlin/Java)", "iOS (Swift)",
                "Cross-platform (Flutter, React Native)", "UI/UX Mobile", "API Integration", "Publish App lên Store"));
        mobile.setSoftSkills(Arrays.asList("Tư duy về trải nghiệm người dùng (User First)", "Kiên nhẫn debug",
                "Cập nhật công nghệ mới"));
        mobile.setSuitableFor("Người thích tạo ra các ứng dụng cầm tay, thích smartphone và trải nghiệm mượt mà.");
        mobile.setCareerPath(Arrays.asList("Junior Mobile Dev", "Senior Mobile Dev", "Mobile Lead", "CTO Startup"));
        mobile.setWorkEnvironments(
                Arrays.asList("Công ty phát triển App", "Công ty Game Mobile", "Tập đoàn công nghệ (Grab, Shopee)"));
        mobile.setSalaryRange("12 - 50 triệu+/tháng. Thường nhỉnh hơn Web một chút ở level Junior.");
        mobile.setJobOpportunities("Cao, đặc biệt là xu hướng Mobile First hiện nay.");
        mobile.setChallenges(Arrays.asList("Phải chạy đua với việc cập nhật iOS/Android hàng năm",
                "Thiết bị phân mảnh (đối với Android)"));
        mobile.setSchools(Arrays.asList("Các trường CNTT", "Trung tâm đào tạo lập trình di động"));
        mobile.setRequiredSkills(Arrays.asList("Kotlin", "Swift", "Flutter", "Mobile UI/UX"));
        mobile.setMarketDemand("Cao");
        majors.add(mobile);

        // Sáng tạo nội dung (Content Creator)
        Major content = new Major("27", "Sáng tạo nội dung", "Nghệ thuật",
                "Lên ý tưởng, sản xuất và quản lý nội dung (bài viết, video, hình ảnh, podcast) trên các nền tảng số để thu hút khán giả và truyền tải thông điệp.");
        content.setHollandType("A"); // Artistic
        content.setEducationRequirement(
                "Không quá quan trọng bằng cấp, quan trọng là tư duy sáng tạo, khả năng ngôn ngữ và bắt trend.");
        content.setTechnicalSkills(
                Arrays.asList("Copywriting/Storytelling", "Quay & Dựng video cơ bản (CapCut, Premiere)",
                        "Chụp ảnh & Thiết kế cơ bản", "SEO & Digital Marketing", "Kỹ năng Livestream"));
        content.setSoftSkills(Arrays.asList("Sáng tạo không ngừng", "Nhạy bén với xu hướng (Trend catching)",
                "Giao tiếp/Diễn xuất trước ống kính", "Quản lý thời gian"));
        content.setSuitableFor(
                "Người năng động, hoạt ngôn, nhiều ý tưởng, thích thể hiện bản thân và chia sẻ giá trị.");
        content.setCareerPath(Arrays.asList("Content Writer", "Content Creator (TikTok/Youtube)", "KOL/KOC",
                "Content Manager", "Giám đốc sáng tạo"));
        content.setWorkEnvironments(Arrays.asList("Agency truyền thông", "Phòng Marketing doanh nghiệp",
                "Làm việc tự do (Freelance)", "Các Studio sáng tạo"));
        content.setSalaryRange("8 - 100 triệu+/tháng. Thu nhập không giới hạn nếu trở thành KOL nổi tiếng.");
        content.setJobOpportunities("Bùng nổ trong kỷ nguyên Social Media (TikTok, Youtube, Facebook).");
        content.setChallenges(Arrays.asList("Áp lực sáng tạo liên tục (Bí content)", "Dễ bị dư luận ném đá (Drama)",
                "Thu nhập không ổn định (nếu làm tự do)"));
        content.setSchools(
                Arrays.asList("HV Báo chí & Tuyên truyền", "ĐH KHXH&NV", "ĐH RMIT", "Các khóa học Content ngắn hạn"));
        content.setRequiredSkills(Arrays.asList("Viết lách", "Dựng video", "Sáng tạo", "Bắt trend"));
        content.setMarketDemand("Rất Cao - Hot trend");
        majors.add(content);

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
                "Kỹ thuật");
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

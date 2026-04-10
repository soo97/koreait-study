package kr.co.secondProject.attendance.controller;


import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.secondProject.attendance.dto.AttendanceStatsDto;
import kr.co.secondProject.attendance.dto.ReqAttendanceDTO;
import kr.co.secondProject.attendance.dto.ResAttendanceDTO;
import kr.co.secondProject.attendance.sevice.AttendanceService;
import lombok.RequiredArgsConstructor;

/**
 * ※ 추가 어노테이션 설명:
 *  - @RestController : @Controller + @ResponseBody 합성 어노테이션
 *                      JSON 응답 반환을 위해 사용 (React 프론트와 REST API 통신)
 *  - @PathVariable   : URL 경로 변수 바인딩 (예: /attendance/{employeeId})
 *  - @RequestBody    : HTTP 요청 본문 → DTO 자동 변환
 *  - @CrossOrigin    : React 개발 서버(localhost:3000)와의 CORS 허용
 *                      운영 환경에서는 WebMvcConfigurer로 전역 설정 권장
 */
@RestController
@RequestMapping("/attendance")
@RequiredArgsConstructor
public class AttendanceController {

    private final AttendanceService attendanceService;

    // ────────────────────────────────────────────────────────────────────────
    // [GET] 근태 이력 전체 조회
    // 화면 : Attendance.jsx 테이블 (근태 이력 섹션)
    // URL  : GET /attendance/{employeeId}
    // ────────────────────────────────────────────────────────────────────────
    @GetMapping("/{employeeId}")
    public CompletableFuture<ResponseEntity<List<ResAttendanceDTO>>> getAttendanceList(
            @PathVariable Long employeeId) {

        return attendanceService.getAttendanceList(employeeId)
                .thenApply(ResponseEntity::ok);
    }

}
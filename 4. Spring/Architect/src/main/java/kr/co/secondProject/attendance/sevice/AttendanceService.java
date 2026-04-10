package kr.co.secondProject.attendance.sevice;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import kr.co.secondProject.attendance.dto.AttendanceStatsDto;
import kr.co.secondProject.attendance.dto.ReqAttendanceDTO;
import kr.co.secondProject.attendance.dto.ResAttendanceDTO;



public interface AttendanceService {

    /**
     * 특정 직원의 근태 이력 전체 조회 (비동기)
     * @param employeeId 직원 ID
     */
    CompletableFuture<List<ResAttendanceDTO>> getAttendanceList(Long employeeId);
}
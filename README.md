# Exercise & Reflection

## Exercise

### 1. JMeter GUI
- Test Plan 1 (all-student)

  - viewResultsTree
    ![testPlan1_viewResultsTree](exercise-report/picture/testPlan1/testPlan1_viewResultsTree.jpg)
  - viewResultsInTable
    ![testPlan1_viewResultsInTable](exercise-report/picture/testPlan1/testPlan1_viewResultsInTable.jpg)
  - summaryReport
    ![testPlan1_summaryReport](exercise-report/picture/testPlan1/testPlan1_summaryReport.jpg)
  - graphResult
    ![testPlan1_graphResult](exercise-report/picture/testPlan1/testPlan1_graphResult.jpg)


- Test Plan 2 (all-student-name)

    - viewResultsTree
      ![testPlan2_viewResultsTree](exercise-report/picture/testPlan2/testPlan2_viewResultsTree.jpg)
    - viewResultsInTable
      ![testPlan2_viewResultsInTable](exercise-report/picture/testPlan2/testPlan2_viewResultsInTable.jpg)
    - summaryReport
      ![testPlan2_summaryReport](exercise-report/picture/testPlan2/testPlan2_summaryReport.jpg)
    - graphResult
      ![testPlan2_graphResult](exercise-report/picture/testPlan2/testPlan2_graphResult.jpg)


- Test Plan 3 (highest-gpa)

    - viewResultsTree
      ![testPlan3_viewResultsTree](exercise-report/picture/testPlan3/testPlan3_viewResultsTree.jpg)
    - viewResultsInTable
      ![testPlan3_viewResultsInTable](exercise-report/picture/testPlan3/testPlan3_viewResultsInTable.jpg)
    - summaryReport
      ![testPlan3_summaryReport](exercise-report/picture/testPlan3/testPlan3_summaryReport.jpg)
    - graphResult
      ![testPlan3_graphResult](exercise-report/picture/testPlan3/testPlan3_graphResult.jpg)


### 2. JMeter Command Line

- Test Plan 1 (all-student)
    - cmd
      ![testPlan1_cmd](exercise-report/picture/testPlan1/testPlan1_cmd.jpg)
    - log
      ![testPlan1_log](exercise-report/picture/testPlan1/testPlan1_log.jpg)
- Test Plan 2 (all-student-name)
    - cmd
      ![testPlan2_cmd](exercise-report/picture/testPlan2/testPlan2_cmd.jpg)
    - log
      ![testPlan2_log](exercise-report/picture/testPlan2/testPlan2_log.jpg)
- Test Plan 3 (highest-gpa)
    - cmd
      ![testPlan3_cmd](exercise-report/picture/testPlan3/testPlan3_cmd.jpg)
    - log
      ![testPlan3_log](exercise-report/picture/testPlan3/testPlan3_log.jpg)

### 3. Profiling

- Test Plan 1 (all-student)
    - Before Optimize
      ![profiling_beforeOptimize_all-student_getAllStudentsWithCourses_CPUTime](exercise-report/picture/profiling_beforeOptimize_all-student_getAllStudentsWithCourses_CPUTime.jpg)
    - After Optimize
      ![profiling_afterOptimize_all-student_getAllStudentsWithCourses_CPUTime](exercise-report/picture/profiling_afterOptimize_all-student_getAllStudentsWithCourses_CPUTime.jpg)
- Test Plan 2 (all-student-name)
    - Before Optimize
      ![profiling_beforeOptimize_all-student-name_joinStudentNames_CPUTime](exercise-report/picture/profiling_beforeOptimize_all-student-name_joinStudentNames_CPUTime.jpg)
    - After Optimize
      ![profiling_afterOptimize_all-student-name_joinStudentNames_CPUTime](exercise-report/picture/profiling_afterOptimize_all-student-name_joinStudentNames_CPUTime.jpg)
- Test Plan 3 (highest-gpa)
    - Before Optimize
      ![profiling_beforeOptimize_highest-gpa_findStudentWithHighestGpa_CPUTime](exercise-report/picture/profiling_beforeOptimize_highest-gpa_findStudentWithHighestGpa_CPUTime.jpg)
    - After Optimize
      ![profiling_afterOptimize_highest-gpa_findStudentWithHighestGpa_CPUTime](exercise-report/picture/profiling_afterOptimize_highest-gpa_findStudentWithHighestGpa_CPUTime.jpg)

### 4. JMeter After Optimize

- Test Plan 1 (all-student)

    - viewResultsTree
      ![afterOptimize_testPlan1_viewResultsTree](exercise-report/picture/testPlan1/afterOptimize_testPlan1_viewResultsTree.jpg)
    - viewResultsInTable
      ![afterOptimize_testPlan1_viewResultsInTable](exercise-report/picture/testPlan1/afterOptimize_testPlan1_viewResultsInTable.jpg)
    - summaryReport
      ![afterOptimize_testPlan1_summaryReport](exercise-report/picture/testPlan1/afterOptimize_testPlan1_summaryReport.jpg)
    - graphResult
      ![afterOptimize_testPlan1_graphResult](exercise-report/picture/testPlan1/afterOptimize_testPlan1_graphResult.jpg)


- Test Plan 2 (all-student-name)

    - viewResultsTree
      ![afterOptimize_testPlan2_viewResultsTree](exercise-report/picture/testPlan2/afterOptimize_testPlan2_viewResultsTree.jpg)
    - viewResultsInTable
      ![afterOptimize_testPlan2_viewResultsInTable](exercise-report/picture/testPlan2/afterOptimize_testPlan2_viewResultsInTable.jpg)
    - summaryReport
      ![afterOptimize_testPlan2_summaryReport](exercise-report/picture/testPlan2/afterOptimize_testPlan2_summaryReport.jpg)
    - graphResult
      ![afterOptimize_testPlan2_graphResult](exercise-report/picture/testPlan2/afterOptimize_testPlan2_graphResult.jpg)


- Test Plan 3 (highest-gpa)

    - viewResultsTree
      ![afterOptimize_testPlan3_viewResultsTree](exercise-report/picture/testPlan3/afterOptimize_testPlan3_viewResultsTree.jpg)
    - viewResultsInTable
      ![afterOptimize_testPlan3_viewResultsInTable](exercise-report/picture/testPlan3/afterOptimize_testPlan3_viewResultsInTable.jpg)
    - summaryReport
      ![afterOptimize_testPlan3_summaryReport](exercise-report/picture/testPlan3/afterOptimize_testPlan3_summaryReport.jpg)
    - graphResult
      ![afterOptimize_testPlan3_graphResult](exercise-report/picture/testPlan3/afterOptimize_testPlan3_graphResult.jpg)

      
**Kesimpulan:**

Iya ada improvement dari pengukuran dengan JMeter. Hal ini terjadi setelah melakukan optimisasi pada setiap method yang
memerlukan optimisasi, yaitu di bagian StudentService.java. Beberapa bagian yang mengalami improvement adalah sample time dimana
misal di all-student dari sekitar 27000 ms menjadi sekitar 900 ms, latency dimana misal di all-student dari sekitar 27000 menjadi 
sekitar 900, throughput dimana misal di all-student-name dari 2.5/sec menjadi 9.8/sec. Jadi, dengan memakai JMeter akan sangat
membantu sebagai alat ukur peforma program untuk melakukan optimisasi.


## Reflection

1. Perbedaan antara kedua tersebut adalah JMeter melakukan evaluasi terhadap performa program secara keseluruhan dan
melakukan evaluasi pada aplikasi saat melakukan pekerjaannya. Sedangkan, Intellij Profiler memberikan informasi detail
mengenai karakteristik peforma dari program. Keduanya merupakan tools yang dapat digunakan dalam membantu 
optimisasi pada program.

2. Profiling process membantu saya pada menganalis secara mendetail dari aktivitas/performa yang dilakukan program.
Hal tersebut mempermudah dan mempercepat dalam melacak weak point pada program. Setelah itu, melakukan perubahan atau
optimisasi pada program hingga mencapai performa yang diharapkan.

3. Iya, Intellij Profiler akan efektif karena memiliki interface yang user friendly, memiliki fitur yang banyak dalam 
melakukan profiling sehingga tinggal dipilih aja yang sesuai kebutuhan, memberikan informasi performa metrics secara mendetail,
dan bisa melakukan profiling secara real-time.

4. Hal utama yang saya alami kesulitan adalah data yang diberikan pada profiling begitu detail dan banyak, membuat saya
kesulitan memahami di awal. Setelah itu, saya membaca ulang pelan-pelan sekaligus mengacu pada definisinya hingga akhirnya
saya memahami bagian-bagian yang saya merasa kesulitan memahami diawal. Lalu, setelah itu saya melakukan optimisasi pada program.

5. Keuntungan utama yang saya dapatkan adalah Intellij profiler sudah bawaan dari Intellij IDEA ultimate sehingga tidak perlu
ribet lagi memakai profiler dari eksternal. Selain itu, fitur yang diberikan sangat banyak sehingga memberikan informasi
yang sangat detail, tinggal dipilih saja aspek yang ingin dicari dalam melakukan profiling.

6. Kembali lagi ke tujuan awal, apa yang ingin dicari dan memahami kembali kemampuan dari Intellij Profiler dan JMeter 
dimana tentunya memiliki kelebihan dan kekurangan. Lalu, bagian informasi yang dinilai meragukan karena merupakan atau
termasuk kelemahannya akan ditinggalkan. Sedangkan, informasi yang dinilai bagian dari kelebihannya akan dipakai sebagai
acuan dalam mengambil keputusan dalam profiling.

7. Strategi yang saya pakai adalah fokus pada bagian yang paling penting/darurat untuk dilakukannya optimisasi, sehingga
darisitu akan memberikan dampak yang jelas pada performa dari program. Hal yang menyangkut performa biasanya berhubungan
dengan algoritma atau database query atau lainnya. Dengan begitu, perlu melakukan refactoring hingga dipastikan 
sudah paling optimal.
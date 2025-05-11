/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crudb.service;

import com.example.crudb.model.Estudiante;
import com.example.crudb.repository.EstudianteRepost;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Benjamín
 */
 @Service
      public class EstudianteService {
      
          @Autowired
          private EstudianteRepost EstudianteRepost;
      
          public List<Estudiante> listarTodas() {
              return EstudianteRepost.findAll();
          }
      
          public Estudiante guardar(Estudiante persona) {
              return EstudianteRepost.save(persona);
          }
      
          public Estudiante obtenerPorId(Long id) {
              return EstudianteRepost.findById(id).orElse(null);
          }
      
          public void eliminar(Long id) {
              EstudianteRepost.deleteById(id);
          }
      }

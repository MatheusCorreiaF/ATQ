/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcf_redfield.atq.fabrica;

import com.mcf_redfield.atq.model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matheus
 */
public class CategoriaDAO
{

    Connection connection;//Variável conexão com BD
    String message = "";

    public String getMessage()
    {
        return message;
    }

    /**
     * Construtor inicializa conexão BD
     *
     * @param message
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    public CategoriaDAO()
    {
        this.connection = ConexaoMySQL.getInstance().getConnection();
    }

    public List<Categoria> listaCategoria()
    {
        //String sql = "SELECT c.id, c.categoria FROM categoria as c";
        String sql = "SELECT c.id, c.categoria , COUNT(questao)as qtdeQ FROM questao q, categoria c where c.id=q.id_cat GROUP BY q.id_cat";

        try {
            List<Categoria> listaCat = new ArrayList<>();
            try (
                    PreparedStatement stmt = connection.prepareStatement(sql);
                    ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    Categoria cat = new Categoria();
                    cat.setIdCat(rs.getInt("id"));
                    cat.setCategoria(rs.getString("categoria"));
                    cat.setQtdeQ(rs.getInt("qtdeQ"));
                    listaCat.add(cat);
                }
            }
            return listaCat;

        } catch (SQLException e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public void inserir(Categoria cat)
    {

        String sql = "INSERT INTO categoria"
                + "(categoria)"
                + "VALUES (?)";

        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, cat.getCategoria());
                stmt.execute();
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluir(Categoria cat) throws SQLException
    {

        String sql = "DELETE FROM categoria WHERE id=? ";
        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setInt(1, cat.getIdCat());
                stmt.execute();
            }
        } catch (SQLException e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}

/**
 * public boolean autenticacao(Cliente cliente) {
 *
 * PreparedStatement pst; ResultSet rs;
 *
 * String sql = "select * from cliente where email= ? and senha = ?";
 *
 * try { pst = connection.prepareStatement(sql); pst.setString(1,
 * cliente.getEmail()); pst.setString(2, cliente.getSenha()); rs =
 * pst.executeQuery();
 *
 * if (rs.next()) {
 *
 * return true; } else { message = "**Email ou senha inválida!!"; return false;
 * }
 *
 * } catch (SQLException error) {
 *
 * }
 * return false; }
 *
 *
 *
 * public boolean verificaCpf(Cliente cliente) {
 *
 * PreparedStatement pst; ResultSet rs;
 *
 * String sql = "select * from cliente where cpf = ?";
 *
 * try { pst = connection.prepareStatement(sql); pst.setString(1,
 * cliente.getCpf()); rs = pst.executeQuery();
 *
 * if (rs.next()) { message = "**Cpf ou e-mail já cadastrado!!"; return true; }
 * else {
 *
 * return false; }
 *
 * } catch (SQLException error) {
 *
 * }
 * return false; }
 *
 * /**
 * Método que adiciona Cliente ao BD
 *
 * @param cliente Cliente
 * @since Marco 3
 */
/**
 * public void adicionar(Cliente cliente) {
 *
 * String sql = "INSERT INTO cliente" +
 * "(cpf,nomeCli,email,senha,fone,numero,cidade,cep,estado,endereco,bairro,complemento)"
 * + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
 *
 * try { try (PreparedStatement stmt = connection.prepareStatement(sql)) {
 * stmt.setString(1, cliente.getCpf()); stmt.setString(2, cliente.getNome());
 * stmt.setString(3, cliente.getEmail()); stmt.setString(4, cliente.getSenha());
 * stmt.setString(5, cliente.getTelefone()); stmt.setString(6,
 * cliente.getNumero()); stmt.setString(7, cliente.getCidade());
 * stmt.setString(8, cliente.getCep()); stmt.setString(9, cliente.getEstado());
 * stmt.setString(10, cliente.getEndereco()); stmt.setString(11,
 * cliente.getBairro()); stmt.setString(12, cliente.getComplemento());
 * stmt.execute();
 *
 * }
 *
 * } catch (SQLException ex) {
 * Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex); }
 *
 * }
 *
 * public Cliente buscaClienteEmail(String email) { String sql = "SELECT * FROM
 * cliente where email = \"" + email + "\"";
 *
 * try { Cliente cliente = new Cliente(); try ( PreparedStatement stmt =
 * connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { while
 * (rs.next()) { cliente.setBairro(rs.getString("bairro"));
 * cliente.setCep(rs.getString("cep"));
 * cliente.setCidade(rs.getString("cidade"));
 * cliente.setComplemento(rs.getString("complemento"));
 * cliente.setCpf(rs.getString("cpf")); cliente.setEmail(rs.getString("email"));
 * cliente.setEndereco(rs.getString("endereco"));
 * cliente.setEstado(rs.getString("estado"));
 * cliente.setNome(rs.getString("nomeCli"));
 * cliente.setNumero(rs.getString("numero"));
 * cliente.setSenha(rs.getString("senha"));
 * cliente.setTelefone(rs.getString("fone")); } } return cliente; } catch
 * (SQLException e) {
 * Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e); }
 * return new Cliente("teste", "teste", "teste", "teste", "teste", "teste",
 * "teste", "teste", "teste", "teste", "teste", "teste"); }
 *
 * public Cliente buscaClienteCPF(String cpf) { String sql = "SELECT * FROM
 * cliente where cpf = \"" + cpf + "\"";
 *
 * try { Cliente cliente = new Cliente(); try ( PreparedStatement stmt =
 * connection.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) { while
 * (rs.next()) { cliente.setBairro(rs.getString("bairro"));
 * cliente.setCep(rs.getString("cep"));
 * cliente.setCidade(rs.getString("cidade"));
 * cliente.setComplemento(rs.getString("complemento"));
 * cliente.setCpf(rs.getString("cpf")); cliente.setEmail(rs.getString("email"));
 * cliente.setEndereco(rs.getString("endereco"));
 * cliente.setEstado(rs.getString("estado"));
 * cliente.setNome(rs.getString("nomeCli"));
 * cliente.setNumero(rs.getString("numero"));
 * cliente.setSenha(rs.getString("senha"));
 * cliente.setTelefone(rs.getString("fone")); } } return cliente; } catch
 * (SQLException e) {
 * Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, e); }
 * return new Cliente("teste", "teste", "teste", "teste", "teste", "teste",
 * "teste", "teste", "teste", "teste", "teste", "teste"); } }
 */
